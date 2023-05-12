#Akami core module for providing API testing


TEST TASK:
1. All scenarios placed api-tests/src/test/resources/features/TestEndpoint.feature
2. Documentation https://app.swaggerhub.com/apis-docs/OLEKSIIKUKHAR/Armenotech/1.0.0#/default/get_payments__paymentId__sep0031_info
3. 










To create repo:
1. Git clone 'armenoteck' repo
2. git submodule init '"base-api" submodule'
3. git submodule update
4. load gradle

To run test
1. Create local.properties folder with config
        environment=armenotechTestEnv

2. Launch ./gradlew.bat api-tests:runtests
