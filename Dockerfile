FROM java:8
VOLUME /tmp

ADD build/libs/inventory-service-*.jar /work/app.jar
ADD run.sh /

ENTRYPOINT ["/run.sh"]
