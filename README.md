#Akami core module for providing API testing


TEST TASK:
1. All scenarios placed api-tests/src/test/resources/features/TestEndpoint.feature
2. Documentation https://app.swaggerhub.com/apis-docs/OLEKSIIKUKHAR/Armenotech/1.0.0#/default/get_payments__paymentId__sep0031_info
3. Repo link: https://github.com/EmilliaClarke/armenotech
4. ./gradlew.bat api-tests:runtests
5. Reports placed in api-tests/report


To create repo:
1. Git clone 'armenoteck' repo
2. git submodule init '"base-api" submodule'
3. git submodule update
4. load gradle

To run test
Launch from console ./gradlew.bat api-tests:runtests
