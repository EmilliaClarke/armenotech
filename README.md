#Akami core module for providing API testing

To create repo:
1. Git clone 'armenoteck' repo
2. git submodule init '"base-api" submodule'
3. git submodule update
4. load gradle

To run test
1. Create local.properties folder with config
        environment=stg2

2. Launch ./gradlew.bat api-tests:runtests
