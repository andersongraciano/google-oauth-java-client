

# Version 1.18.0-rc #

_April 10, 2014_

| [New Features in base library](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.18.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.18.0-rc/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.18.0-rc/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:

  * [Deprecated com.google.api.client.extensions.jdo.auth.oauth2](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.16.0-rc/com/google/api/client/extensions/jdo/auth/oauth2/package-summary.html)
  * [Removed com.google.api.client.auth.oauth2.MemoryCredentialStore](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.16.0-rc/com/google/api/client/auth/oauth2/MemoryCredentialStore.html)

# Version 1.16.0-rc #

_August 5, 2013_

| [New Features in base library](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.16.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.16.0-rc/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.16.0-rc/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:

  * [Updated to google-http-java-client version 1.16.0-rc](http://google-http-java-client.blogspot.com/2013/08/version-1160-rc-released.html)
  * [[Issue 47](https://code.google.com/p/google-oauth-java-client/issues/detail?id=47) and [Issue 31](https://code.google.com/p/google-oauth-java-client/issues/detail?id=31)] Added a credential DataStore based on a String key and Serializable value (See [HTTP Issue 216](https://code.google.com/p/google-http-java-client/issues/detail?id=216))
  * [[Issue 79](https://code.google.com/p/google-oauth-java-client/issues/detail?id=79)] Added a new ID Token verifier class
  * [[Issue 78](https://code.google.com/p/google-oauth-java-client/issues/detail?id=78)] Updated to ID Token draft 27
  * [[Issue 70](https://code.google.com/p/google-oauth-java-client/issues/detail?id=70)] Added a check against the WWW-Authenticate header for expired tokens
  * [[Issue 82](https://code.google.com/p/google-oauth-java-client/issues/detail?id=82)] Removed Beta API deprecated in 1.15 _(backwards incompatible change)_
  * [[Issue 77](https://code.google.com/p/google-oauth-java-client/issues/detail?id=77)] Improved the Javadoc for Credential.refreshToken


# Version 1.15.0-rc #

_May 10, 2013_

| [New Features in base library](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.15.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.15.0-rc/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.15.0-rc/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Announcing the first release candidate of the Google OAuth Java Client library!  The library is finally going out of beta.

Note that there are still some features of the library in active development that may require backwards incompatible changes in future releases before they are ready to fully go out of beta.  Each of these features is annotated with a @Beta tag.


Highlights:

  * [Updated to google-http-java-client version 1.15.0-rc](http://google-http-java-client.blogspot.com/2013/05/version-1150-rc-released.html)
  * [[Issue 63](https://code.google.com/p/google-oauth-java-client/issues/detail?id=63)]: OAuth 1 support is now Beta
  * [[Issue 74](https://code.google.com/p/google-oauth-java-client/issues/detail?id=74)]: Removed deprecated API from 1.14 (backwards incompatible)
  * [[Issue 73](https://code.google.com/p/google-oauth-java-client/issues/detail?id=73)]: Fixed a bug where calling setScopes(...) with null resulted in a NullPointerException
  * [[Issue 48](https://code.google.com/p/google-oauth-java-client/issues/detail?id=48)]: Fixed a bug in JdoCredentialStore where transient instances couldn’t be deleted
  * [[Issue 46](https://code.google.com/p/google-oauth-java-client/issues/detail?id=46)]: Fixed an issue with JdoCredentialStore causing a “Duplicate entry exception”

# Version 1.14.1-beta #

_Mar 25, 2013_

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.14.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.14.1-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.14.1-beta/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:

  * Updated to [google-http-java-client version 1.14.1-beta](http://google-http-java-client.blogspot.com/2013/03/version-1141-beta-released.html)
  * [[Issue 56](http://code.google.com/p/google-oauth-java-client/issues/detail?id=56)]: Implemented OAuth 2.0 final standard
  * [[Issue 24](http://code.google.com/p/google-oauth-java-client/issues/detail?id=24)] and [[Issue 41](http://code.google.com/p/google-oauth-java-client/issues/detail?id=41)]: OAuth 2.0 support for password and client credentials
  * [[Issue 64](http://code.google.com/p/google-oauth-java-client/issues/detail?id=64)]: Moved PrivateKeys into SecurityUtils in the HTTP project. See [[HTTP Issue 178](http://code.google.com/p/google-http-java-client/issues/detail?id=178)]
  * [[Issue 68](http://code.google.com/p/google-oauth-java-client/issues/detail?id=68)]: Moved JsonWebToken to the HTTP project. See [[HTTP Issue 191](http://code.google.com/p/google-http-java-client/issues/detail?id=191)]
  * [[Issue 66](http://code.google.com/p/google-oauth-java-client/issues/detail?id=66)]: BearerToken.authorizationHeaderAccessMethod now uses getAuthorizationAsList
  * [[Issue 67](http://code.google.com/p/google-oauth-java-client/issues/detail?id=67)]: Renamed dependencies files to match package names


# Version 1.13.1-beta #

_Jan 17, 2013_

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.13.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.13.1-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.13.1-beta/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:

  * Updated to [google-http-java-client version 1.13.1-beta](http://google-http-java-client.blogspot.com/2013/01/version-1131-beta-released.html)
  * [[Issue 61](http://code.google.com/p/google-oauth-java-client/issues/detail?id=61)] Java 7 implementation of FileCredentialStore
  * [[Issue 60](http://code.google.com/p/google-oauth-java-client/issues/detail?id=60)] FileCredentialStore: don’t allow symbolic links

# Version 1.12.0-beta #

_Nov 2, 2012_

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.12.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.12.0-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.12.0-beta/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:

  * Updated to [google-http-java-client version 1.12](http://google-http-java-client.blogspot.com/2012/11/version-1120-beta-released_2495.html).
  * [[Issue 55](http://code.google.com/p/google-oauth-java-client/issues/detail?id=55)] Fixed [FileCredentialStore](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.12.0-beta/com/google/api/client/extensions/java6/auth/oauth2/FileCredentialStore.html) failure on Windows.

# Version 1.11.0-beta #

_Sept 5, 2012_

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.11.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.11.0-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.11.0-beta/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 44](http://code.google.com/p/google-oauth-java-client/issues/detail?id=44)] Removed deprecated classes/methods/fields from version 1.10.
  * [[Issue 27](http://code.google.com/p/google-oauth-java-client/issues/detail?id=27)] Added FileCredentialStore.
  * [[Issue 52](http://code.google.com/p/google-oauth-java-client/issues/detail?id=52)] Added OAuth 2.0 command-line helpers.
  * [[Issue 50](http://code.google.com/p/google-oauth-java-client/issues/detail?id=50)] Added AuthorizationCodeFlow.Builder.setAuthorizationServerEncodedUrl.
  * [[Issue 51](http://code.google.com/p/google-oauth-java-client/issues/detail?id=51)] Created properties files for Eclipse Android support.
  * [[Issue 49](http://code.google.com/p/google-oauth-java-client/issues/detail?id=49)] Added a way to set the “state” parameter to AbstractAuthorizationCodeServlet.
  * Updated to google-http-java-client version 1.11.

# Version 1.10.1-beta #

_June 25, 2012_

| [Bugs Fixed](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone=Version1.10.1%20status=Fixed&colspec=ID%20Type%20Priority%20Summary) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.10.1-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.10.1-beta/jdiff/changes.html) |
|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Bugs Fixed:<br />
Updated to google-http-java-client version 1.10.3-beta.

# Version 1.10.0-beta #

_June 14, 2012_

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.10.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.10.0-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.10.0-beta/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 125](http://code.google.com/p/google-http-java-client/issues/detail?id=125)] Fixed issue of creating UrlFetchTransport in GAE SDK 1.6.6 in google-http-java-client.
  * [[Issue 116](http://code.google.com/p/google-http-java-client/issues/detail?id=116)] Fixed CloseGuard error after EOFException in google-http-java-client.
  * [[Issue 78](http://code.google.com/p/google-http-java-client/issues/detail?id=78)] Fixed memory leaks in google-http-java-client.
  * [[Issue 118](http://code.google.com/p/google-http-java-client/issues/detail?id=118)] UriTemplate.expand now supports Iterable for list parameters in google-http-java-client.
  * [[Issue 42](http://code.google.com/p/google-oauth-java-client/issues/detail?id=42)] Failures in Access token requests for OAuth 2.0 assertion profile are not caught anymore.
  * [[Issue 40](http://code.google.com/p/google-oauth-java-client/issues/detail?id=40)] CredentialStore methods now declare throws IOException.
  * Updated to google-http-java-client version 1.10.

# Version 1.9.0-beta #

_May 18, 2012_

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.9.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.9.0-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.9.0-beta/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 37](http://code.google.com/p/google-oauth-java-client/issues/detail?id=37)] Removed xpp3 as a dependency for Android.
  * [[Issue 33](http://code.google.com/p/google-oauth-java-client/issues/detail?id=33)] Generalized dependency instructions for non-Android.
  * [[Issue 38](http://code.google.com/p/google-oauth-java-client/issues/detail?id=38)] Created new structure for jars in the zip package.
  * [[Issue 35](http://code.google.com/p/google-oauth-java-client/issues/detail?id=35)] Removed deprecated classes/methods/fields from version 1.8
  * Updated to [google-http-java-client version 1.9](http://google-http-java-client.blogspot.com/2012/05/version-190-beta-released.html).

# Version 1.8.0-beta #

_April 4, 2012_

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.8.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.8.0-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.8.0-beta/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 30](http://code.google.com/p/google-oauth-java-client/issues/detail?id=30)] encodeBase64String NoSuchMethodError has been fixed.
  * [[Issue 28](http://code.google.com/p/google-oauth-java-client/issues/detail?id=28)] Some deprecated classes/methods/fields from version 1.7 have been removed.
**Updated to [google-http-java-client version 1.8](http://google-http-java-client.blogspot.com/2012/04/version-183-beta-released.html).**

# Version 1.7.0-beta #

_Mar 12, 2012_

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.7.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.7.0-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.7.0-beta/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 18](http://code.google.com/p/google-oauth-java-client/issues/detail?id=18)] Updated to the latest [OAuth 2.0](http://code.google.com/p/google-oauth-java-client/wiki/OAuth2) (draft 23).
  * [[Issue 23](http://code.google.com/p/google-oauth-java-client/issues/detail?id=23)] Added support for JSON Web Token (JWT) and JSON Web Signature (JWS).
  * [[Issue 10](http://code.google.com/p/google-oauth-java-client/issues/detail?id=10)] App Engine DataStore API.
  * [[Issue 25](http://code.google.com/p/google-oauth-java-client/issues/detail?id=25)] Split and renamed extension projects to be more intuitive.
  * [[Issue 17](http://code.google.com/p/google-oauth-java-client/issues/detail?id=17)] Deprecated classes/methods/fields from version 1.6 have been removed.
  * Updated to [google-http-java-client version 1.7](http://google-http-java-client.blogspot.com/2012/03/version-170-beta-released.html).

# Version 1.6.0-beta #

_Nov 8, 2011_

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone%3DVersion1.6.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.6.0-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.6.0-beta/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * extensions.auth.helpers.appengine package has been renamed to extensions.appengine.auth.helpers.
  * Deprecated classes/methods/fields from version 1.5 have been removed.
  * Updated to [google-http-java-client version 1.6](http://code.google.com/p/google-http-java-client/wiki/ReleaseNotes#Version_1.6.0-beta).

# Version 1.5.2-beta #

| [Bugs Fixed](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone=Version1.5.2%20status=Fixed&colspec=ID%20Type%20Priority%20Summary) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.2-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.2-beta/jdiff/changes.html) |
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

[Bugs Fixed](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone=Version1.5.2%20status=Fixed&colspec=ID%20Type%20Priority%20Summary):<br />
Issue [15](http://code.google.com/p/google-oauth-java-client/issues/detail?id=15): Update pom.xml in 1.5 branch to point to google-http-java-client 1.5.3-beta<br />
Please take a look at the [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.2-beta/index.html).

# Version 1.5.1-beta #

| [Bugs Fixed](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone=Version1.5.1%20status=Fixed&colspec=ID%20Type%20Priority%20Summary) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.1-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.1-beta/jdiff/changes.html) |
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

[Bugs Fixed](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone=Version1.5.1%20status=Fixed&colspec=ID%20Type%20Priority%20Summary):<br />
Issue [14](http://code.google.com/p/google-oauth-java-client/issues/detail?id=14): Allow refreshToken to be null in OAuth2Credential and AccessProtectedResource<br />
Please take a look at the [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.1-beta/index.html).

# Version 1.5.0-beta #

| [New Features](http://code.google.com/p/google-oauth-java-client/issues/list?can=1&q=milestone=Version1.5.0%20status=Fixed&colspec=ID%20Type%20Priority%20Summary) | [JavaDoc](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.0-beta/index.html) | [JDiff](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.0-beta/jdiff/changes.html) |
|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Announcing the release of the new [Google OAuth Client Library for Java project](http://code.google.com/p/google-oauth-java-client) split off from the [Google API Client Library for Java project](http://code.google.com/p/google-api-java-client)!  It contains the OAuth 1.0a and OAuth 2.0 (draft 10) packages that should work with any OAuth-based service on the web.

Additional highlights:
  * [OAuth 2.0 App Engine assertion flow](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.0-beta/com/google/api/client/extensions/auth/helpers/appengine/package-summary.html)
  * [OAuth 1.0 persistence helpers](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.5.0-beta/com/google/api/client/extensions/auth/helpers/oauth/package-summary.html)

# Version 1.4.1-beta #

See [Version 1.4.1-beta Release Notes from Google API Client Library for Java](http://code.google.com/p/google-api-java-client/wiki/ReleaseNotes#Version_1.4.1-beta).