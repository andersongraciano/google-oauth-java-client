[OAuth 1.0](http://tools.ietf.org/html/rfc5849) is a standard specification for allowing end users to securely authorize a client application to access protected server-side resources.

# Important Notices #

## @Beta ##

The OAuth 1.0a support provided by the Google OAuth Client Library for Java is [@Beta](https://code.google.com/p/google-api-java-client/#@Beta).

## Use only with non-Google services ##

Do not use OAuth 1.0 to access Google APIs, because Google has deprecated its support for OAuth 1.0 in favor of OAuth 2.0. If you currently have an app that accesses Google APIs using OAuth 1.0, see [Migrating from OAuth 1.0 to OAuth 2.0](https://developers.google.com/accounts/docs/OAuth_ref#migration).

# Using OAuth 1.0 #

Google OAuth Client Library for Java supports two types of signature methods for OAuth 1.0a ([@Beta](https://code.google.com/p/google-api-java-client/#@Beta)), which we provide for use with non-Google services:
  * HMAC-SHA1 ([OAuthHmacSigner](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/auth/oauth/OAuthHmacSigner.html))
  * RSA-SHA1 ([OAuthRsaSigner](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/auth/oauth/OAuthRsaSigner.html))

For details, see the [Javadoc for the OAuth 1.0 package](http://javadoc.google-oauth-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/auth/oauth/package-summary.html).