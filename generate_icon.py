from PIL import Image, ImageDraw, ImageFilter
import os
import random
import math

def generate_space_icon(size):
    img = Image.new("RGBA", (size, size), (5, 3, 26, 255))
    draw = ImageDraw.Draw(img)

    # Space background gradient
    for y in range(size):
        for x in range(size):
            dist = math.sqrt((x - size/2)**2 + (y - size/2)**2)
            factor = 1 - min(dist / (size * 0.7), 1)
            r = int(5 + factor * 40)
            g = int(3 + factor * 10)
            b = int(26 + factor * 60)
            draw.point((x, y), fill=(r, g, b, 255))

    # Stars
    random.seed(99)
    for _ in range(max(20, size // 3)):
        sx = random.randint(2, size - 3)
        sy = random.randint(2, size - 3)
        brightness = random.randint(180, 255)
        draw.point((sx, sy), fill=(brightness, brightness, brightness, 255))
        if size > 72:
            draw.point((sx+1, sy), fill=(brightness//2, brightness//2, brightness//2, 180))
            draw.point((sx, sy+1), fill=(brightness//2, brightness//2, brightness//2, 180))

    # Purple nebula glow
    center = size // 2
    for r in range(size // 3, 0, -1):
        alpha = int(80 * (1 - r / (size // 3)))
        col = (100 + int(20 * r / (size // 3)), 20, 180, alpha)
        draw.ellipse([center-r, center-r, center+r, center+r], outline=col)

    # Cyan outer ring
    ring_r = size // 3
    draw.ellipse([
        center - ring_r, center - ring_r,
        center + ring_r, center + ring_r
    ], outline=(0, 200, 255, 120), width=max(1, size // 48))

    # Draw N letter
    pad = size // 5
    stroke = max(2, size // 14)
    top = pad
    bottom = size - pad
    left = pad
    right = size - pad

    cyan = (0, 229, 255, 255)
    white = (220, 240, 255, 255)

    # Left bar
    draw.rectangle([left, top, left + stroke, bottom], fill=cyan)
    # Right bar
    draw.rectangle([right - stroke, top, right, bottom], fill=cyan)
    # Diagonal
    steps = bottom - top
    for i in range(steps + stroke):
        ratio = i / steps
        x = int(left + ratio * (right - left - stroke))
        y = int(top + ratio * (bottom - top))
        draw.rectangle([x, y, x + stroke, y + stroke], fill=white)

    # Glow pass
    glow = img.filter(ImageFilter.GaussianBlur(radius=max(1, size // 32)))
    img = Image.blend(img, glow, 0.3)

    # Redraw N sharp
    draw = ImageDraw.Draw(img)
    draw.rectangle([left, top, left + stroke, bottom], fill=cyan)
    draw.rectangle([right - stroke, top, right, bottom], fill=cyan)
    for i in range(steps + stroke):
        ratio = i / steps
        x = int(left + ratio * (right - left - stroke))
        y = int(top + ratio * (bottom - top))
        draw.rectangle([x, y, x + stroke, y + stroke], fill=white)

    return img.convert("RGB")

icons = {
    "app/src/main/res/mipmap-mdpi/ic_launcher.png": 48,
    "app/src/main/res/mipmap-mdpi/ic_launcher_round.png": 48,
    "app/src/main/res/mipmap-hdpi/ic_launcher.png": 72,
    "app/src/main/res/mipmap-hdpi/ic_launcher_round.png": 72,
    "app/src/main/res/mipmap-xhdpi/ic_launcher.png": 96,
    "app/src/main/res/mipmap-xhdpi/ic_launcher_round.png": 96,
    "app/src/main/res/mipmap-xxhdpi/ic_launcher.png": 144,
    "app/src/main/res/mipmap-xxhdpi/ic_launcher_round.png": 144,
    "app/src/main/res/mipmap-xxxhdpi/ic_launcher.png": 192,
    "app/src/main/res/mipmap-xxxhdpi/ic_launcher_round.png": 192,
}

for path, size in icons.items():
    os.makedirs(os.path.dirname(path), exist_ok=True)
    icon = generate_space_icon(size)
    icon.save(path)
    print(f"Saved {size}x{size} -> {path}")

print("Done! All space icons generated.")
