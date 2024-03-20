package com.dawinder.btnjc

val programmingLanguages = listOf(
    ProgrammingLanguage(
        name = "Java",
        imageUrl = "https://upload.wikimedia.org/wikipedia/en/thumb/3/30/Java_programming_language_logo.svg/220px-Java_programming_language_logo.svg.png",
        shortDescription = "Java is a popular object-oriented programming language known for its portability, security features, and vast ecosystem.",
        longDescription = """
            Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It is known for its portability, as Java programs can run on any device that has the Java Virtual Machine (JVM). Java is widely used in enterprise software development, web development, mobile app development (especially for Android), and more.

            One of the key features of Java is its strong emphasis on security. It includes features such as a security manager and automatic memory management through garbage collection, which help prevent common security vulnerabilities and memory-related errors.

            Java's extensive standard library and rich ecosystem of third-party libraries and frameworks make it a versatile language for building various types of applications. It has a large and active community of developers, which contributes to its ongoing evolution and support.

            Despite its age, Java remains relevant and widely used in the software industry, particularly in large-scale enterprise applications and Android app development.
        """.trimIndent()
    ),
    ProgrammingLanguage(
        name = "Kotlin",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/11/Kotlin_logo_2021.svg/360px-Kotlin_logo_2021.svg.png",
        shortDescription = "Kotlin is a statically typed programming language developed by JetBrains, known for its safety, conciseness, and interoperability with Java.",
        longDescription = """
            Kotlin is a modern, statically typed programming language that runs on the Java Virtual Machine (JVM). Developed by JetBrains, the creators of IntelliJ IDEA, Kotlin aims to improve upon the shortcomings of Java while maintaining full compatibility with existing Java code and libraries.

            One of Kotlin's standout features is its focus on safety. It introduces null safety through its type system, which helps prevent null pointer exceptions, a common source of bugs in Java code. Kotlin achieves this by distinguishing between nullable and non-nullable types, forcing developers to handle nullability explicitly.

            Another key feature of Kotlin is its concise syntax. It reduces boilerplate code compared to Java, resulting in cleaner and more readable code. Features such as type inference and lambda expressions allow developers to express their intentions more clearly and with fewer lines of code.

            Kotlin's interoperability with Java is seamless, allowing developers to leverage existing Java libraries and frameworks without any significant overhead. This makes Kotlin a practical choice for projects that need to integrate with Java codebases or take advantage of the extensive Java ecosystem.

            Kotlin has gained significant traction in the Android development community since Google announced official support for it in 2017. Many Android developers have embraced Kotlin for its modern features, enhanced productivity, and improved safety compared to Java.

            In addition to Android development, Kotlin is also used for server-side development, web development (with frameworks like Ktor), and other application domains. Its versatility, combined with its rich feature set and strong tooling support, makes it a compelling choice for a wide range of software development projects.
        """.trimIndent()
    ),
    ProgrammingLanguage(
        name = "Python",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Python-logo-notext.svg/240px-Python-logo-notext.svg.png",
        shortDescription = "Python is a high-level, interpreted programming language known for its simplicity, readability, and vast community support.",
        longDescription = """
            Python is a high-level, interpreted programming language known for its simplicity, readability, and versatility. It emphasizes code readability and a clean syntax, making it an ideal language for beginners and experienced programmers alike.

            Python supports multiple programming paradigms, including procedural, object-oriented, and functional programming. It has a comprehensive standard library and a rich ecosystem of third-party packages and frameworks, which contribute to its popularity and usefulness in various domains such as web development, data analysis, artificial intelligence, scientific computing, and more.

            One of Python's strengths is its strong community support and active development. The Python community is known for its inclusivity, collaboration, and dedication to open-source principles. This vibrant community contributes to the continuous improvement and evolution of the language and its ecosystem.

            Python's popularity continues to grow, driven by its ease of learning, flexibility, and applicability to a wide range of use cases. It is widely used by individuals, organizations, and educational institutions worldwide, cementing its position as one of the most popular and influential programming languages.
        """.trimIndent()
    ),
    ProgrammingLanguage(
        name = "JavaScript",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/240px-Unofficial_JavaScript_logo_2.svg.png",
        shortDescription = "JavaScript is a versatile, dynamically typed programming language used primarily for web development to add interactivity and functionality to websites.",
        longDescription = """
            JavaScript is a versatile, dynamically typed programming language primarily used for client-side web development. It enables developers to add interactivity and dynamic functionality to websites, making it an essential component of modern web development alongside HTML and CSS.

            JavaScript is supported by all major web browsers, allowing developers to create interactive web pages that respond to user actions in real time. In addition to client-side scripting, JavaScript is also used for server-side development (with platforms like Node.js), game development, desktop application development, and more.

            JavaScript's syntax is influenced by Java and C, making it familiar to developers from various programming backgrounds. It supports object-oriented, imperative, and functional programming paradigms, offering flexibility and expressive power for building complex applications.

            Despite its initial limitations and quirks, JavaScript has evolved significantly over the years, thanks to ongoing standardization efforts and improvements in web browser technology. Modern JavaScript frameworks and libraries, such as React, Angular, and Vue.js, have further enhanced the language's capabilities and developer productivity.

            JavaScript's ubiquity, versatility, and vibrant ecosystem make it one of the most widely used programming languages in the world, powering the dynamic and interactive web experiences that users have come to expect.
        """.trimIndent()
    ),
    ProgrammingLanguage(
        name = "C++",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/ISO_C%2B%2B_Logo.svg/240px-ISO_C%2B%2B_Logo.svg.png",
        shortDescription = "C++ is a powerful, high-performance programming language used for system/software development, game development, and more.",
        longDescription = """
            C++ is a general-purpose, statically typed programming language that builds on the syntax and semantics of the C programming language. It is widely used for system programming, software development, game development, and other performance-critical applications.

            C++ is known for its efficiency, performance, and control over hardware resources. It provides low-level memory manipulation features and direct access to hardware, making it suitable for developing operating systems, device drivers, embedded systems, and high-performance applications.

            One of C++'s key features is its support for object-oriented programming (OOP) and generic programming paradigms. It allows developers to write reusable and modular code using classes, inheritance, polymorphism, templates, and other OOP concepts.

            Despite its complexity and steep learning curve, C++ remains a popular choice for projects that require maximum performance and fine-grained control over system resources. It has a large and active community of developers, extensive documentation, and a rich ecosystem of libraries and tools.

            C++ continues to evolve with each new standard (e.g., C++11, C++14, C++17, C++20), introducing new features, improvements, and modernization efforts to make the language more expressive, safer, and easier to use.
        """.trimIndent()
    ),
    ProgrammingLanguage(
        name = "C#",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0d/C_Sharp_wordmark.svg/240px-C_Sharp_wordmark.svg.png",
        shortDescription = "C# is a modern, general-purpose programming language developed by Microsoft, known for its simplicity, type safety, and versatility.",
        longDescription = """
            C# (pronounced C-sharp) is a modern, general-purpose programming language developed by Microsoft as part of its .NET initiative. It is designed for building a wide range of applications, including desktop applications, web applications, games, mobile apps, cloud services, and more.

            C# combines the power and flexibility of C++ with the simplicity and readability of Java. It features a rich set of language constructs, including strong typing, automatic memory management (via garbage collection), and support for object-oriented, imperative, and functional programming paradigms.

            One of C#'s key features is its seamless integration with the .NET framework, which provides a comprehensive set of libraries and tools for building modern applications. This tight integration enables developers to leverage the full power of the .NET ecosystem, including libraries for web development, database access, cryptography, and more.

            C# is known for its type safety and robustness, thanks to features such as static typing, exception handling, and extensive compile-time checks. It also offers language features like properties, events, delegates, and LINQ (Language-Integrated Query) for expressive and efficient code.

            C# is widely used in enterprise software development, game development (with platforms like Unity), and web development (with ASP.NET Core). Its popularity continues to grow, driven by its rich feature set, strong community support, and ongoing development efforts by Microsoft.
        """.trimIndent()
    ),
    ProgrammingLanguage(
        name = "Swift",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Swift_logo.svg/400px-Swift_logo.svg.png",
        shortDescription = "Swift is a modern, open-source programming language developed by Apple for building iOS, macOS, watchOS, and tvOS applications.",
        longDescription = """
            Swift is a modern, open-source programming language developed by Apple for building iOS, macOS, watchOS, and tvOS applications. It is designed to be safe, fast, and expressive, with a syntax that is concise yet expressive.

            Swift builds on the best features of C and Objective-C while introducing modern language concepts and improvements. It features powerful type inference, optionals for handling nil values safely, automatic memory management (via Automatic Reference Counting), and functional programming constructs.

            One of Swift's key goals is to improve developer productivity and code readability. It achieves this through features such as type inference, closures, tuples, and pattern matching, which allow developers to write clean, concise, and expressive code.

            Swift is tightly integrated with the Apple ecosystem, providing seamless interoperability with Objective-C and access to Apple's frameworks and APIs. It offers a modern development experience with features like playgrounds for experimenting with code, Xcode IDE support, and interactive debugging tools.

            Swift has gained popularity among developers for its safety, performance, and ease of learning. It is used by millions of developers worldwide to build a wide range of applications, from simple utilities to complex, high-performance software running on Apple's platforms.
        """.trimIndent()
    ),
    ProgrammingLanguage(
        name = "Ruby",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Ruby_logo.svg/240px-Ruby_logo.svg.png",
        shortDescription = "Ruby is a dynamic, object-oriented programming language known for its simplicity, productivity, and elegant syntax.",
        longDescription = """
            Ruby is a dynamic, object-oriented programming language known for its simplicity, productivity, and elegant syntax. It was designed with developer happiness and productivity in mind, emphasizing readability and programmer convenience.

            Ruby's syntax is highly expressive and readable, with features like blocks, closures, and dynamic typing that allow developers to write concise and idiomatic code. It supports object-oriented programming paradigms, including classes, inheritance, and mixins, as well as functional programming concepts.

            One of Ruby's defining characteristics is its focus on developer productivity. It includes features like automatic memory management (via garbage collection), dynamic typing, and a powerful standard library, which enable rapid development and iteration.

            Ruby gained widespread popularity with the release of the Ruby on Rails web framework, which revolutionized web development by providing a streamlined and productive environment for building web applications. Ruby on Rails follows the "convention over configuration" principle, allowing developers to focus on writing application code rather than configuring infrastructure.

            Ruby's vibrant community and ecosystem contribute to its ongoing evolution and support. It has a rich collection of libraries (gems) and a strong culture of open-source collaboration, which fosters innovation and creativity in the Ruby community.
        """.trimIndent()
    ),
)