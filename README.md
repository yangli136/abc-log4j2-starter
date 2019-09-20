_README FILE_

---

# Log4j2 Configuration for Spring Boot based Java applications

## Usage
This library provides:

### 1. Spring Boot log4j2 customized configuration ###

By including this library as a Maven dependency in Maven pom.xml:

- your project will be configured with all required log4j2 dependencies
- all other logging libraries such as common-logging, logback etc will be excluded

Add the following dependency into pom.xml


    <dependency>
        <groupId>org.abcframework</groupId>
        <artifactId>abc-log4j2-starter</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>

### 2. An externalized default log file configuration ###
The default log4j2.xml configuration is located in **config/log/** directory, it could be used to configure log files by adding the following system property to Java command:

    -Dlogging.config=file:/app/abcframework/config/log4j2.xml

As best practices, the following types of log are provided by default.

- console
- server.json
- server.log
- exception.log
- event.log
- stats.log
- perf.log
- sql.log

Here is an example how to generate log entries to eventJson log file:

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonLogFileTypes.EVENT.code() + ATaskScheduler.class);
    
    @Scheduled(cron = "#{'${abc.cron.config.aScheduledTask}'}")
    public void run() {
        LOGGER.info("entered CopyFileToIsilonTask run()...");
        ...


### 3. ELK integration ready

All log files are in JSON format except: console and serverColorCodedText

- The log4j2.xml configuration file includes logstash template as out-of-box ELK integration.
- The log files will be searchable after they are fed into ELK.
- The color-coded text based log provides color patterns for different types of fields in log files.