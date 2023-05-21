package ru.lesson.practical001.sample;

import ru.lesson.practical001.regular.Decorator;
import ru.lesson.practical001.regular.OtherClass;

// javac -sourcepath ./java  -d out java/ru/lesson/practical001/sample/Main.java
// java -classpath ./out ru.lesson.practical001.sample.Main
// javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages ru

// FROM bellsoft/liberica-openjdk-alpine:11.0.16
// COPY ./java ./src
// RUN mkdir ./out
// RUN javac -sourcepath ./src -d out src/ru/lesson/practical001/sample/Main.java
// CMD java -classpath ./out ru.lesson.practical001.sample.Main

// docker build . -t myjavaapp:latest
// docker run myjavaapp:latest
// docker run --rm myjavaapp:latest

// FROM bellsoft/liberica-openjdk-alpine:11.0.16 as BuildProject
// WORKDIR /app
// COPY ./java ./src
// RUN mkdir ./out
// RUN javac -sourcepath ./src -d out ./src/ru/lesson/practical001/sample/Main.java

// FROM scratch as OutputFiles
// COPY --from=BuildProject /app/out /bin

// docker buildx build --output type=local,dest=. .

// FROM bellsoft/liberica-openjdk-alpine:11.0.16
// WORKDIR /app
// COPY ./bin .
// CMD java -classpath . ru.lesson.practical001.sample.Main

// docker build . -t runjavaapp:v1
// docker run runjavaapp:v1

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.add(7, 6);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(12, 4);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(14, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(3, 5);
        System.out.println(Decorator.decorate(result));
    }
}
