plugins {
    id(Plugins.AGP.application)
    kotlin(Plugins.Kotlin.android)
    kotlin(Plugins.Kotlin.kapt)

    // Hilt
    id(Plugins.Hilt.plugin)

    // Parcelize
    id(Plugins.Kotlin.parcelize)
}

android {
    namespace = "kg.erjan.composepractice"
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "kg.erjan.composepractice"
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
        debug {
            applicationIdSuffix = ".debug"
            isDebuggable = true
        }
    }
    compileOptions {
        sourceCompatibility = Options.compileOptions
        targetCompatibility = Options.compileOptions
    }
    buildFeatures {
        compose = true
    }
    kotlinOptions {
        jvmTarget = Options.kotlinOptions
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
}

dependencies {

    // Kotlin
    implementation(Libraries.Coroutines.android)

    // Core
    implementation(Libraries.Core.core)

    // Lifecycle
    implementation(Libraries.Lifecycle.viewModel)
    implementation(Libraries.Lifecycle.runtime)

    // Activity
    implementation(Libraries.Activity.activity)

    // Hilt
    implementation(Libraries.Hilt.android)
    kapt(Libraries.Hilt.compiler)

    //Compose
    implementation(Libraries.Compose.composeUi)
    implementation(Libraries.Compose.composeUiToolingPreview)
    implementation(Libraries.Compose.composeMaterial)

    // Retrofit
    implementation(Libraries.Retrofit.retrofit)
    implementation(Libraries.Retrofit.converterGson)

    //Coil
    implementation(Libraries.Compose.coilCompose)

    // OkHttp
    implementation(Libraries.OkHttp.bom)
    implementation(Libraries.OkHttp.okHttp)
    implementation(Libraries.OkHttp.loggingInterceptor)

    // Paging
    api(Libraries.Paging.runtime)
    implementation(Libraries.Paging.common)
    implementation(Libraries.Paging.pagingCompose)
}