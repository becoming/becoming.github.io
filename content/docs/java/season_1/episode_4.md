---
weight: 4
bookFlatSection: true
title: "Episode 4, Compile with Maven"
---

# Episode 3, Compile with Maven

[Season 1 - From Lame to Fame](/docs/java/season_1/)

1. Go to your `lameapp` directory
1. Create a text file with name `pom.xml`
1. Use a simple text editor to edit `pom.xml` file (_e.g. Notepad, Notepad++, Kate, Kwrite, Gedit, Nano, vim_)
1. Type the following content (_no copy/pasting or a kitty will die_): 
    - OK, this part you can copy paste: `<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">`
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">

	<modelVersion>4.0.0</modelVersion>

	<groupId>tech.mecoming</groupId>
	<artifactId>lameapp</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>

	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<release>11</release>
				</configuration>
			</plugin>
		</plugins>
	</build>

</project>
```
1. Save the file
1. Create the following directory structure `src/main/java/tech/becoming/lameapp`
1. Copy `LameApp.java` to `src/main/java/tech/becoming/lameapp`
1. The root of your app will become now this path `src/main/java/`
1. Use a simple text editor to edit `LameApp.java` file (_e.g. Notepad, Notepad++, Kate, Kwrite, Gedit, Nano, vim_)
    - Add one line at the start of the file `package tech.becoming.lameapp;`
    - Note **tech.becoming.lameapp** refers to _src/main/java/_**tech/becoming/lameapp** has
1. Now open the **terminal** or `cmd`
1. Type `mvn clean package` and hit `Enter`
1. When `BUILD SUCCESS`, your app will be located under newly created directory called `target/` 
    - The name of your app will be `lameapp-0.0.1-SNAPSHOT.jar`
    - Which equals to `<artifactId>` a _dash_ and `<version>` tags from `pom.xml`
1. Then we can run the built app like this: 
```shell script
java -cp target/lameapp-0.0.1-SNAPSHOT.jar tech.becoming.lameapp.LameApp
```

{{< button href="https://youtu.be/MLLseEQRnzA?t=7" >}}You did it my friend, enjoy your little victory!{{< /button >}}

**Homework**
1. You'll need to read and practice this article [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
    - It'll take you much more than 5 minutes
    - And you'll not remember everything
    - But it is very important for you to practice it
1. Then this [Introduction to the Maven's Standard Directory Layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)