ARG XSK_VERSION=latest
FROM dirigiblelabs/xsk:$XSK_VERSION as base

ENV CNB_USER_ID=1001
ENV CNB_GROUP_ID=1001
ENV CNB_STACK_ID="com.sap.kneo.xsk"
LABEL io.buildpacks.stack.id="com.sap.kneo.xsk"


RUN chmod -R 777 /usr/local/tomcat

FROM base as run

RUN chmod -R 777 /usr/local/tomcat

FROM base as build

RUN chmod -R 777 /usr/local/tomcat

