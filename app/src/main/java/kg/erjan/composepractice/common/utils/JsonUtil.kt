package kg.erjan.composepractice.common.utils

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

internal inline fun <reified T> fromJson(file: String): T {
    return Gson().fromJson(file, object : TypeToken<T>() {}.type)
}

internal fun Context.jsonFromAssets(fileName: String): String {
    return this.assets.open(fileName).bufferedReader().use { it.readText() }
}