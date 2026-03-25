package com.rajk2007.novacast

import android.content.Context
import com.lagradost.api.setContext
import com.rajk2007.novacast.utils.DataStore.getKey
import com.rajk2007.novacast.utils.DataStore.removeKeys
import com.rajk2007.novacast.utils.DataStore.setKey
import java.lang.ref.WeakReference

/**
 * Deprecated alias for NovaCastApp for backwards compatibility with plugins.
 * Use NovaCastApp instead.
 */
// Deprecate after next stable
/*@Deprecated(
    message = "AcraApplication is deprecated, use NovaCastApp instead",
    replaceWith = ReplaceWith("com.rajk2007.novacast.NovaCastApp"),
    level = DeprecationLevel.WARNING
)*/
class AcraApplication {
	// All methods here can be changed to be a wrapper around NovaCast app
	// without a seperate deprecation after next stable. All methods should
	// also be deprecated at that time.
	companion object {

		// This can be removed without deprecation after next stable
		private var _context: WeakReference<Context>? = null
		/*@Deprecated(
		    message = "AcraApplication is deprecated, use NovaCastApp instead",
		    replaceWith = ReplaceWith("com.rajk2007.novacast.NovaCastApp.context"),
		    level = DeprecationLevel.WARNING
		)*/
		var context
		get() = _context?.get()
		internal set(value) {
			_context = WeakReference(value)
			setContext(WeakReference(value))
		}

		/*@Deprecated(
		    message = "AcraApplication is deprecated, use NovaCastApp instead",
		    replaceWith = ReplaceWith("com.rajk2007.novacast.NovaCastApp.removeKeys(folder)"),
		    level = DeprecationLevel.WARNING
		)*/
		fun removeKeys(folder: String): Int? {
            return context?.removeKeys(folder)
        }

		/*@Deprecated(
		    message = "AcraApplication is deprecated, use NovaCastApp instead",
		    replaceWith = ReplaceWith("com.rajk2007.novacast.NovaCastApp.setKey(path, value)"),
		    level = DeprecationLevel.WARNING
		)*/
		fun <T> setKey(path: String, value: T) {
			context?.setKey(path, value)
		}

		/*@Deprecated(
		    message = "AcraApplication is deprecated, use NovaCastApp instead",
		    replaceWith = ReplaceWith("com.rajk2007.novacast.NovaCastApp.setKey(folder, path, value)"),
		    level = DeprecationLevel.WARNING
		)*/
		fun <T> setKey(folder: String, path: String, value: T) {
			context?.setKey(folder, path, value)
		}

		/*@Deprecated(
		    message = "AcraApplication is deprecated, use NovaCastApp instead",
		    replaceWith = ReplaceWith("com.rajk2007.novacast.NovaCastApp.getKey(path, defVal)"),
		    level = DeprecationLevel.WARNING
		)*/
		inline fun <reified T : Any> getKey(path: String, defVal: T?): T? {
			return context?.getKey(path, defVal)
		}

		/*@Deprecated(
		    message = "AcraApplication is deprecated, use NovaCastApp instead",
		    replaceWith = ReplaceWith("com.rajk2007.novacast.NovaCastApp.getKey(path)"),
		    level = DeprecationLevel.WARNING
		)*/
		inline fun <reified T : Any> getKey(path: String): T? {
			return context?.getKey(path)
		}

		/*@Deprecated(
		    message = "AcraApplication is deprecated, use NovaCastApp instead",
		    replaceWith = ReplaceWith("com.rajk2007.novacast.NovaCastApp.getKey(folder, path)"),
		    level = DeprecationLevel.WARNING
		)*/
		inline fun <reified T : Any> getKey(folder: String, path: String): T? {
			return context?.getKey(folder, path)
		}

		/*@Deprecated(
		    message = "AcraApplication is deprecated, use NovaCastApp instead",
		    replaceWith = ReplaceWith("com.rajk2007.novacast.NovaCastApp.getKey(folder, path, defVal)"),
		    level = DeprecationLevel.WARNING
		)*/
		inline fun <reified T : Any> getKey(folder: String, path: String, defVal: T?): T? {
			return context?.getKey(folder, path, defVal)
		}
	}
}
