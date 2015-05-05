You can download the Google OAuth Client Library for Java and its dependencies in a zip file, or you can use Maven.



Also see the [ProGuard setup instructions](http://code.google.com/p/google-http-java-client/wiki/Setup#ProGuard) that are part of the Google HTTP Client Library for Java documentation.

# Download the Library with Dependencies #

Download the latest zip file, which you can find on the [Downloads page](Downloads.md), and extract it on your computer. This zip file contains the client library class .jar files and the associated source .jar files for each artifact and their dependencies. You can find dependency graphs and licenses for the different libraries in the dependencies folder. For more details about the contents of the download, see the readme.html file.

## Eclipse ##

If you use [Eclipse](http://www.eclipse.org), set the "Source attachment" for each class .jar file to its corresponding "-sources" .jar file.

## Android ##

If you are developing for Android and the Google API you want to use is included in the [Google Play Services library](https://developer.android.com/google/play-services/index.html), use that library for the best performance and experience.

If you are using the Google OAuth Client Library for Java with Android, it is important to know which dependencies are compatible with Android, specifically which Android SDK level. Android applications require the following .jar files, or newer compatible versions, from the libs folder:
  * google-oauth-client-1.18.0-rc.jar
  * google-http-client-1.18.0-rc.jar
  * google-http-client-android-1.18.0-rc.jar
  * gson-2.1.jar
  * jackson-core-2.1.3.jar
  * jackson-core-asl-1.9.11.jar
  * jsr305-1.3.9.jar
  * protobuf-java-2.4.1.jar

**WARNING:** For Android, you MUST place the .jar files in a directory named "libs" so that the APK packager can find them. Otherwise, you will get a `NoClassDefFoundError` error at runtime.

## Google App Engine ##

Google App Engine applications require the following .jar files, or newer compatible versions, from the libs folder:
  * google-oauth-client-1.18.0-rc.jar
  * google-oauth-client-appengine-1.18.0-rc.jar
  * google-oauth-client-servlet-1.18.0-rc.jar
  * google-http-client-1.18.0-rc.jar
  * google-http-client-appengine-1.18.0-rc.jar
  * gson-2.1.jar
  * jackson-core-2.1.3.jar
  * jackson-core-asl-1.9.11.jar
  * jdo2-api-2.3-eb.jar
  * jsr305-1.3.9.jar
  * protobuf-java-2.4.1.jar
  * transaction-api-1.1.jar
  * xpp3-1.1.4c.jar

## Servlet ##

Servlet applications require the following .jar files, or newer compatible versions, from the libs folder:
  * google-oauth-client-1.18.0-rc.jar
  * google-oauth-client-servlet-1.18.0-rc.jar
  * google-http-client-1.18.0-rc.jar
  * commons-logging-1.1.1.jar
  * gson-2.1.jar
  * httpclient-4.0.1.jar
  * httpcore-4.0.1.jar
  * jackson-core-2.1.3.jar
  * jackson-core-asl-1.9.11.jar
  * jdo2-api-2.3-eb.jar
  * jsr305-1.3.9.jar
  * protobuf-java-2.4.1.jar
  * transaction-api-1.1.jar
  * xpp3-1.1.4c.jar

## Generic Java ##

General purpose Java 5 applications require the following .jar files, or newer compatible versions, from the libs folder:
  * google-oauth-client-1.18.0-rc.jar
  * google-http-client-1.18.0-rc.jar
  * commons-logging-1.1.1.jar
  * gson-2.1.jar
  * httpclient-4.0.1.jar
  * httpcore-4.0.1.jar
  * jackson-core-2.1.3.jar
  * jackson-core-asl-1.9.11.jar
  * jsr305-1.3.9.jar
  * protobuf-java-2.4.1.jar
  * xpp3-1.1.4c.jar

# Maven #

The Google APIs Client Library for Java is in the central [Maven](http://maven.apache.org) repository. The Maven `groupId` for all artifacts for this library is `com.google.api-client`. Specific Maven instructions are given for each module (below).

If you use [Eclipse](http://www.eclipse.org), install the [Maven plugin](http://www.eclipse.org/m2e/). Also make sure to set your Eclipse preferences as follows:
  1. Within Eclipse, select **Window > Preferences** (or on Mac, **Eclipse > Preferences**).
  1. Select **Maven** and select the following options:
    * "Download Artifact Sources"
    * "Download Artifact JavaDoc"

# Modules #

This library is composed of five modules: [google-oauth-client](#google-oauth-client.md), [google-oauth-client-servlet](#google-oauth-client-servlet.md), [google-oauth-client-appengine](#google-oauth-client-appengine.md), [google-oauth-client-java6](#google-oauth-client-java6.md), and [google-oauth-client-jetty](#google-oauth-client-jetty.md).

## google-oauth-client ##

Google OAuth Client Library for Java (google-oauth-client) is designed to be compatible with all supported Java platforms, including Android.

Maven usage:

```
<dependency>
  <groupId>com.google.oauth-client</groupId>
  <artifactId>google-oauth-client</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

On Android, you will need to explicitly exclude unused dependencies:

```
<dependency>
  <groupId>com.google.oauth-client</groupId>
  <artifactId>google-oauth-client</artifactId>
  <version>1.18.0-rc</version>
  <exclusions>
    <exclusion>
      <artifactId>xpp3</artifactId>
      <groupId>xpp3</groupId>
    </exclusion>
    <exclusion>
      <artifactId>httpclient</artifactId>
      <groupId>org.apache.httpcomponents</groupId>
    </exclusion>
    <exclusion>
      <artifactId>junit</artifactId>
      <groupId>junit</groupId>
    </exclusion>
    <exclusion>
      <artifactId>android</artifactId>
      <groupId>com.google.android</groupId>
    </exclusion>
  </exclusions>
</dependency>
```

## google-oauth-client-servlet ##

Servlet and JDO extensions to the Google OAuth Client Library for Java (google-oauth-client-servlet) support Java servlet web applications. This module depends on google-oauth-client.

Maven usage:

```
<dependency>
  <groupId>com.google.oauth-client</groupId>
  <artifactId>google-oauth-client-servlet</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-oauth-client-appengine ##

Google App Engine extensions to the Google OAuth Client Library for Java (google-oauth-client-appengine) support Java Google App Engine applications. This module depends on google-oauth-client and google-oauth-client-servlet.

Maven usage:

```
<dependency>
  <groupId>com.google.oauth-client</groupId>
  <artifactId>google-oauth-client-appengine</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-oauth-client-java6 ##

Java 6 (and higher) extensions to the Google OAuth Client Library for Java (google-oauth-client-java6) support Java6+ applications. This module depends on google-oauth-client.

Maven usage:

```
<dependency>
  <groupId>com.google.oauth-client</groupId>
  <artifactId>google-oauth-client-java6</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-oauth-client-jetty ##

Jetty extensions to the Google OAuth Client Library for Java (google-oauth-client-java6) support authorization code flow for installed applications. This module depends on google-oauth-client-java6.

Maven usage:

```
<dependency>
  <groupId>com.google.oauth-client</groupId>
  <artifactId>google-oauth-client-jetty</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```