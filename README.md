# CONF4J - Configuration for Java
A simple library to load system properties or environment variables.

Basically, for system properties, instead of doing the following
```java
class Foo {
    public static void main(String[] args)
    {
        String connUrl = System.getProperty("connection.url");
        System.out.println(connUrl);
    }
}
```
and for environment variables, instead of doing the following
```java
class Foo {
    public static void main(String[] args)
    {
        String connUrl = System.getenv("connection.url");
        System.out.println(connUrl);
    }
}
```

You can access your settings just doing the following

```java
import com.foogaro.util.Conf4J;

class Foo {
    public static void main(String[] args) {
        String connUrl = Conf4J.get("connection.url");
        System.out.println(connUrl);
    }
}
```

# Why

Since I moved to containers, most of the time I had to access application's configuration as system properties and/or environment variables.
I didn't look/google too much around, and it was easier to implement the Conf4J class.

# Conclusion
So there might be something more sophisticated somewhere, in that case, go for it.

Ciao,
Luigi
