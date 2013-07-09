# ring-basic-auth-test

Small library to assist in performing Basic authentication while testing Ring applications.

## Usage

ring-basic-auth-test provides a simple function, `authorize`, to wrap any request with Basic authorization header. `authorize` implements a closure to lexically scope your username and password.

Here's how you authenticate:

``` clojure
(use 'ring-basic-auth-test.authorize)

(defn my-own-authorize []
  (authorize "username" "password"))
```

Now you can use your authorize function anywhere you like:

```
(app (my-own-authorize (request :get "/my-endpoint")))
```

## License

Copyright © 2013 Banzai Inc.

Distributed under the Eclipse Public License, the same as Clojure.
