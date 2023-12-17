import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {

    const val material = "com.google.android.material:material:1.7.0"

    const val roomKtx = "androidx.room:room-ktx:${Versions.room_version}"

    const val roomCompiler = "androidx.room:room-compiler:${Versions.room_version}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room_version}"

    const val navigationFragments = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"

    const val navigationUi = "androidx.navigation:navigation-ui:${Versions.navVersion}"

    const val navSageArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navVersion}"

    const val coreKtx = "androidx.core:core-ktx:1.9.0"

    const val fragmentKtx = "androidx.fragment:fragment-ktx:1.5.5"

    const val activityKtx = "androidx.activity:activity-ktx:1.6.1"

    const val appCompat = "androidx.appcompat:appcompat:1.6.0"

    const val lifeCycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1"

    const val lifeCycleViewModelRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"

    const val junit = "junit:junit:4.12"

    const val testEspresso = "androidx.test.espresso:espresso-core:3.5.1"

    const val androidTestJunit = "androidx.test.ext:junit:1.1.5"

    const val koinAndroid = "org.koin:koin-android:${Versions.koin_version}"

    const val koinScope = "org.koin:koin-android-scope:${Versions.koin_version}"

}

fun DependencyHandler.room() {
    implementation(Dependencies.roomCompiler)
    implementation(Dependencies.roomKtx)
    kapt(Dependencies.roomRuntime)

}

fun DependencyHandler.koin() {
    implementation(Dependencies.koinAndroid)
    implementation(Dependencies.koinScope)

}

fun DependencyHandler.navigation() {
    implementation(Dependencies.navigationUi)
    implementation(Dependencies.navigationFragments)
    implementation(Dependencies.navSageArgs)
}

fun DependencyHandler.lifeCycleViewModel() {
    implementation(Dependencies.lifeCycleViewModelKtx)
    implementation(Dependencies.lifeCycleViewModelRuntime)
    implementation(Dependencies.navSageArgs)
}

fun DependencyHandler.kotlin() {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
}


fun DependencyHandler.androidUi() {
    implementation(Dependencies.material)
    implementation(Dependencies.constraintLayout)
}

fun DependencyHandler.componentktx() {
    implementation(Dependencies.fragmentKtx)
    implementation(Dependencies.activityKtx)
}

fun DependencyHandler.test() {
    implementation(Dependencies.testEspresso)
    implementation(Dependencies.junit)
    implementation(Dependencies.androidTestJunit)

}



