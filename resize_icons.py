import os
from PIL import Image, ImageDraw

def create_round_icon(img):
    # Create a circular mask
    mask = Image.new('L', img.size, 0)
    draw = ImageDraw.Draw(mask)
    draw.ellipse((0, 0) + img.size, fill=255)
    
    # Apply the mask to the image
    round_img = Image.new('RGBA', img.size, (0, 0, 0, 0))
    round_img.paste(img, (0, 0), mask=mask)
    return round_img

def resize_and_save():
    base_path = "/home/ubuntu/NovaCast/app_icon_base.png"
    res_dir = "/home/ubuntu/NovaCast/app/src/main/res"
    
    sizes = {
        "mipmap-mdpi": 48,
        "mipmap-hdpi": 72,
        "mipmap-xhdpi": 96,
        "mipmap-xxhdpi": 144,
        "mipmap-xxxhdpi": 192
    }
    
    img = Image.open(base_path).convert("RGBA")
    
    for folder, size in sizes.items():
        target_folder = os.path.join(res_dir, folder)
        os.makedirs(target_folder, exist_ok=True)
        
        # Square icon
        resized_img = img.resize((size, size), Image.Resampling.LANCZOS)
        resized_img.save(os.path.join(target_folder, "ic_launcher.png"))
        
        # Round icon
        round_img = create_round_icon(resized_img)
        round_img.save(os.path.join(target_folder, "ic_launcher_round.png"))
        
        print(f"Saved icons to {folder} (size: {size}x{size})")

if __name__ == "__main__":
    resize_and_save()
