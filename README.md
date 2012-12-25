test-mvn-sam-example
======================
bat-for-karaf
====================
Different .bat files for cleaning up karaf.

-----------------------------------------------------------------
sam-server and sam-common
====================
Fork to original sam-server with working recreate parameter.

-----------------------------------------------------------------
recoString
====================

recoString is an example that demonstrates how web servise can cooperate with sam features and karaf container. 
The folowing steps will show how connect your own service with sam . If you want to test my example
go straight to "Running the example" chapter. 


#Agent Installation in a Servlet container



Add it to the classpath using a Maven dependency:
  

        <dependency> 
        <groupId>org.talend.esb</groupId>
	<version>{talend esb version}</version>
        </dependency>

Add it to the Spring context:

        <import resource="classpath:META-INF/tesb/agent-context.xml" />

Then, add the Agent as a jaxws:features to the endpoint/client for Spring-related services, for example:

        <jaxws:endpoint
    id="customerService" address="/CustomerServicePort" 
    implementor="com.example.customerservice.server.CustomerServiceImpl"> 
    <jaxws:features>
        <ref bean="eventFeature"/>
    </jaxws:features>
        </jaxws:endpoint>

#Configurating

Next in folder \service\src\main\resources create two files :

        agent.properties 
        logging.properties
And configurate them :

For agent:

        collector.scheduler.interval=500
        collector.maxEventsPerCall=10
        collector.lifecycleEvent=false

        log.messageContent=true
        log.maxContentLength=-1
        log.enforceMessageIDTransfer=false

        service.url=http://localhost:8040/services/MonitoringServiceSOAP
        service.retry.number=3
        service.retry.delay=5000

For logging:

        handlers = java.util.logging.ConsoleHandler, java.util.logging.FileHandler 


        .level = WARNING 


        java.util.logging.ConsoleHandler.level = INFO 


        java.util.logging.FileHandler.level = ALL 


        java.util.logging.ConsoleHandler.formatter = org.sopera.monitoring.util.CustomLogFormatter


        org.talend.esb.sam.level = WARNING 
        org.eclipse.persistence.level = WARNING

#Running the example


- Start karaf with sam-server and connected datasource . 
- Deploy recoString.war into Tomcat . 
- With soapUI create request and type the string .
