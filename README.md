# Text-Encryptor
Encrypts plain text using Java Cipher

## Preview
![_00](https://user-images.githubusercontent.com/73052393/157036032-58f825c2-bcd6-487e-ac24-08b425f0d477.jpg)
![_01](https://user-images.githubusercontent.com/73052393/157036065-7ae32108-454b-4f00-b0ee-10ff160b867f.jpg)

# How to Use 
## Gradle Integration

> Step 1. Add the JitPack repository to your build file

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

> Step 2. Add the dependency

```gradle
dependencies {
	implementation 'com.github.ashutosh2706:text-encryptor:1.0.1'
}
```

## Maven Integration

> Step 1. Add the JitPack repository to your build file

```<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

> Step 2. Add the dependency

```<dependency>
	    <groupId>com.github.ashutosh2706</groupId>
	    <artifactId>text-encryptor</artifactId>
	    <version>1.0.0</version>
	</dependency>
```
## Usage

### Java


#### To encrypt text
``` 
Encryptor.encrypt("some message","your password");
```

#### To decrypt text
```
Encryptor.decrypt(key,"password");
```

key is the return string of Encryptor.encrypt();



