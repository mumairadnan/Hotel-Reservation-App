fastlane documentation
----

# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```sh
xcode-select --install
```

For _fastlane_ installation instructions, see [Installing _fastlane_](https://docs.fastlane.tools/#installing-fastlane)

# Available Actions

## Android

### android production

```sh
[bundle exec] fastlane android production
```

Builds a production version of the app

### android staging

```sh
[bundle exec] fastlane android staging
```

Builds a staging version of the app

### android get_current_tag

```sh
[bundle exec] fastlane android get_current_tag
```

Get current tag

### android get_commits_count

```sh
[bundle exec] fastlane android get_commits_count
```

Get commit counts

### android get_current_build_version

```sh
[bundle exec] fastlane android get_current_build_version
```

Get generated build version

### android beta

```sh
[bundle exec] fastlane android beta
```



### android release

```sh
[bundle exec] fastlane android release
```



----

This README.md is auto-generated and will be re-generated every time [_fastlane_](https://fastlane.tools) is run.

More information about _fastlane_ can be found on [fastlane.tools](https://fastlane.tools).

The documentation of _fastlane_ can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
