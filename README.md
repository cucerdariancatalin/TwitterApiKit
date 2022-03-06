![Optmized for twitterapiv2](https://img.shields.io/badge/TwitterApi-v2-blue?style=for-the-badge&logo=twitter)
![Jitpack](https://img.shields.io/jitpack/v/github/kojofosu/TwitterApiKit?style=for-the-badge&color=2F9319)

# TwitterApiKit
✔️ This library is featured on the [Official Twitter Api Documentation Page](https://developer.twitter.com/en/docs/twitter-api/tools-and-libraries/v2) and is still in development!

Twitter's API v2 Objectified. This will save you time from creating data objects to access twitter's API v2. This library is supported on `Gradle`, `Maven`, `Java`, `Kotlin`, and `Android` projects. 

`NOTE` : Twitter's API v2 is fairly new and keeps changing, so this library may also change to stay updated with the new changes made by the Twitter team. 
To contribute, you can fork this repo and make a pull request after.


## Objects Tested and Ready
- [x] Spaces
- [x] Tweets
- [x] Users
- [ ] List
- [ ] Poll
- [ ] Media
- [ ] Place


## Setup
### Gradle
Step 1: Add the Jitpack repository to your build file. Add it in your root `build.gradle` at the end of repositories.
```gradle
allprojects {
   repositories {
      //omitted for brevvity
      maven { url 'https://jitpack.io' }
   }
}
```
Step 2: Add the dependency
```gradle
dependencies {
    implementation 'com.github.kojofosu:TwitterApiKit:${twitterapikit.version}'
}	
```


### Maven
Step 1: Add the Jitpack repository to your `pom` file.
```xml
<repositories>
   <repository>
       <id>jitpack.io</id>
       <url>https://jitpack.io</url>
   </repository>
</repositories>
```
Step 2: Add the dependency
```xml
<dependency>
    <groupId>com.github.kojofosu</groupId>
    <artifactId>TwitterApiKit</artifactId>
    <version>${twitterapikit.version}</version>
</dependency>
```

That's it! Now you can intialize object models and use them.

![twitterapikitdemo](https://user-images.githubusercontent.com/20203694/147694414-4de8935d-e576-4978-80b6-122d65c73ad6.gif)

### 📙 [Documentation](https://kojofosu.github.io/TwitterApiKit/documentation/dokka/index.html)


## LICENSE
```
   Copyright 2021 KOJO FOSU BEMPA EDUE

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
