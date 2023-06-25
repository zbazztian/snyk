# Snyk POC Links #


## Snyk Code (SAST) ##

* [Supported languages and frameworks](https://docs.snyk.io/scan-application-code/snyk-code/snyk-code-language-and-framework-support)
* [List of rules](https://docs.snyk.io/scan-application-code/snyk-code/security-rules-used-by-snyk-code)

## Snyk Open Source (SCA) ##

* [Vulnerability database](https://security.snyk.io/)
* [Vulnerability database information](https://docs.snyk.io/scan-application-code/snyk-open-source/starting-to-fix-vulnerabilities/using-the-snyk-vulnerability-database)
* [Supported ecosystems](https://docs.snyk.io/scan-application-code/snyk-open-source/snyk-open-source-supported-languages-and-package-managers)

## Snyk CLI cheat sheet ##
Cheat sheet:
```
npm install snyk -g                                    // installation
snyk code test --sarif > results.sarif                 // run Snyk Code in the current directory
snyk test --sarif > sca-results.sarif                  // run Snyk Open Source (SCA) in the current directory
snyk container test --sarif ubuntu > container.sarif   // run Snyk Container on the specified Docker image
snyk iac test --sarif > iac.sarif                      // run Snyk Infrastructure as Code
```
