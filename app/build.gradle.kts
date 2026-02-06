plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)
    id("androidx.room")
}

room {
    schemaDirectory("$projectDir/schemas")
}

android {
    namespace = "com.demo.gglauncher"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.google.googlelauncher"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    api(libs.androidx.annotation)

    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)

    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.kotlinx.coroutines.android)
    api(libs.kotlinx.coroutines.core)
    api(libs.androidx.activity.ktx)
    api(libs.androidx.fragment.ktx)

    api(libs.androidx.media3.exoplayer)
    api(libs.androidx.media3.ui)


    // kotlin的序列化 protobuf
    api(libs.kotlinx.serialization.json)
    api(libs.kotlinx.serialization.protobuf)

    implementation("androidx.dynamicanimation:dynamicanimation:1.1.0")
    implementation("androidx.dynamicanimation:dynamicanimation-ktx:1.1.0")

}