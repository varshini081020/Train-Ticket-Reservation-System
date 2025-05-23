# Use official Tomcat 8.5 base image with JDK
FROM tomcat:8.5-jdk17

# Clean default webapps to avoid conflicts
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your built WAR file to ROOT.war so it deploys at /
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose default Tomcat port
EXPOSE 8080

#echo hello ggg

# Start Tomcat server
CMD ["catalina.sh", "run"]
