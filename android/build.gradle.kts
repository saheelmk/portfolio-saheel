plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.portfolio_saheel"
        minSdk = 21
        targetSdk = 33
    }

    namespace = "com.example.portfolio_saheel" // required

    ndkVersion = "27.0.12077973"
}



dependencies {
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.5.21")
}
