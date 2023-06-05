Based on
https://medium.com/mobile-learning/build-react-native-library-by-create-react-native-library-da64ad6e391a
Original
https://reactnative.dev/docs/native-modules-setup

> sobre modos de include

https://developer.android.com/studio/build/dependencies?hl=es-419

==== After broken build
I had to comment out the jcenter()  commands in build.gradle.
If it is required by any of your libraries, you would need to check if there is a newer version of the library, which does not need it.
Obviously, you will need to delete the following folders (if any of them exists) before trying to rebuild your app.
android/.grdale, android/.idea, android/build & android/app/build



Setup under https://reactnative.dev/docs/running-on-device
https://www.movesense.com/resources/
https://github.com/Salt-PepperEngineering/react-native-nordic-dfu

Forked from https://github.com/tugberka/react-native-mds
https://www.npmjs.com/package/react-native-movesense


API defined at
https://bitbucket.org/movesense/movesense-device-lib/src/master/

Download items from https://bitbucket.org/movesense/movesense-mobile-lib/downloads/?tab=downloads


== How to start from scratch

> npx create-react-native-library mds-react-native
> cd ios && gem install cocoapods
> yarn install

