object Sdk {
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 29
    const val COMPILE_SDK_VERSION = 29
}

object Versions {
    const val ANDROIDX_TEST_EXT = "1.1.1"
    const val ANDROIDX_TEST = "1.2.0"
    const val ANDROIDX_NAVIGATION = "2.2.2"
    const val ANDROIDX_FRAGMENT = "1.2.4"
    const val APPCOMPAT = "1.1.0"
    const val CONSTRAINT_LAYOUT = "1.1.3"
    const val CORE_KTX = "1.2.0"
    const val ESPRESSO_CORE = "3.2.0"
    const val JUNIT = "4.13"
    const val KTLINT = "0.36.0"
    const val DAGGER = "2.27"
    const val OK_HTTP = "4.7.2"
    const val RX_KOTLIN = "3.0.0"
    const val MOSHI = "1.9.2"
    const val SLIDE_UP_PANEL = "3.4.0"
}

object BuildPluginsVersion {
    const val AGP = "3.6.3"
    const val DETEKT = "1.8.0"
    const val KOTLIN = "1.3.72"
    const val KTLINT = "9.2.1"
    const val VERSIONS_PLUGIN = "0.28.0"
}

object SupportLibs {
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "com.android.support.constraint:constraint-layout:${Versions.CONSTRAINT_LAYOUT}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val ANDROIDX_NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.ANDROIDX_NAVIGATION}"
    const val ANDROIDX_NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.ANDROIDX_NAVIGATION}"
    const val ANDROIDX_FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.ANDROIDX_FRAGMENT}"
    const val DAGGER = "com.google.dagger:dagger:${Versions.DAGGER}"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${Versions.DAGGER}"
    const val OK_HTTP = "com.squareup.okhttp3:okhttp:${Versions.OK_HTTP}"
    const val OK_HTTP_LOGGING = "com.squareup.okhttp3:logging-interceptor:${Versions.OK_HTTP}"
    const val RX_KOTLIN = "com.github.reactivex:rxkotlin:${Versions.RX_KOTLIN}"
    const val MOSHI = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"
    const val MOSHI_ADAPTERS = "com.squareup.moshi:moshi-adapters:${Versions.MOSHI}"
    const val SLIDE_UP_PANEL = "com.sothree.slidinguppanel:library:${Versions.SLIDE_UP_PANEL}"
}

object TestingLib {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
}

object AndroidTestingLib {
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}
