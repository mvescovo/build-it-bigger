# Build It Bigger
An Android app to demonstrate product flavors and libraries.

# Features

- Fee version with test ads from AdMob
- Paid version with no ads
- Java library to provide jokes
- Android library to display jokes
- Google Cloud Endpoints backend to retrieve jokes
- Connected Test to check that a joke was received
- Gradle task to:
    - start the local development backend module
    - run all connectedCheck tests
    - stop the backend

# Install
To run the app in debug mode:

- select "jokes_backend" in the run configuration menu and start the backend
- when the backend is started you can run the app in debug mode

To run the app in release mode:

- generate a keystore and place it in the root of the project.
- create a "keystore.properties" file and add the values as specified in the signing config.
- deploy the jokes_backend module to a Google Cloud project.

# Licence
[![AUR](https://img.shields.io/aur/license/yaourt.svg)]()

[GNU General Public License v3.0](http://choosealicense.com/licenses/gpl-3.0/)