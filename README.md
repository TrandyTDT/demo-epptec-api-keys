# Api Keys

Demo how to use Api keys in Spring Boot

## What is Api

Application programming interface is a way for two or more computer programs or components to communicate with each other.

## What is Api Key

An API key is a token that identifies the API client to the API without referencing an actual user. The token can be sent in the query string or as a request header. Like Basic authentication, it’s possible to hide the key using SSL.

## Why Api Key

REST APIs are stateless. Thus, they shouldn’t use sessions or cookies. Instead, these should be secure using Basic authentication, API Keys, JWT, or OAuth2-based tokens.

## Pros of Api Keys?

- Easy to use, easy to understand
- In my opinion its a best and easiest way how to secure the REST API

## Cons of Api Keys?

- If leaked its a security problem

### Extra

- Never publish your api keys to public github
- Should not call endpoint with apikey directly from Client. Should use some layer in between to obscure API key. Theres no way how to obscure API key just with Client.