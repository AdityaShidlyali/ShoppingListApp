# Shopping Item
**Shopping Item** is item lising application based on local database application performing CRUD operations.

<img src="https://github.com/AdityaShidlyali/ShoppingListApp/blob/main/images/shopping_list.jpg" />

## Features
* User can create and save shopping item persistently.
* User can update shopping item.
* User can delete bought shopping item.
* User can interact with the app with one hand as it is a single activity application, as all the operations can be done by user with single click.

## Project structure (MVVM)
* adapters
* db
    * entities
* di
* models
* repositories
* viewmodels

## Android :heart: Koltin
* Generic Recycler View is used for listing the of items.
* Kotlin Coroutines are implemented to peroform the long running tasks of the IO operations like inserting, updating, deleting etc., the items from the Room Database.
* Koin framework is used for dependency injection.

## Tech stack used
- [Room DB](https://developer.android.com/training/data-storage/room) - Local Persistant Database for Application.
- [Coroutines](https://developer.android.com/kotlin/coroutines) - For asynchronous operations.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Lifecycle aware library to manage data observing the lifecycle of licecycle owner.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - State holder class to hold observable data.
- [Koin DI](https://insert-koin.io/docs/reference/koin-android/start) - Lightweight Dependency Injection Framework for Android.

## Licence
```
MIT License

Copyright (c) 2022 Aditya Shidlyali

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
