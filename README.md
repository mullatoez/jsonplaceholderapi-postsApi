# jsonplaceholderapi-postsApi

A simple android app using Kotlin, Retrofit, RxJava, LiveData and the JsonPlaceHolderApi

api url -> https://jsonplaceholder.typicode.com/posts

architecture used --> MVVM

Dependencies used

def lifecycle_version = "2.4.0"

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.1.0'

    implementation 'com.squareup.retrofit2:adapter-rxjava2:2.9.0'

    implementation 'io.reactivex.rxjava2:rxandroid:2.0.1'
    implementation 'io.reactivex.rxjava2:rxjava:2.2.9'
