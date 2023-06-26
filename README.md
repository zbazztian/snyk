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
```shell
npm install snyk -g                                    // installation
snyk test --sarif > sca-results.sarif                  // run Snyk Open Source (SCA) in the current directory
snyk code test --sarif > results.sarif                 // run Snyk Code in the current directory
snyk container test --sarif ubuntu > container.sarif   // run Snyk Container on the specified Docker image
snyk iac test --sarif > iac.sarif                      // run Snyk Infrastructure as Code
```

## Case Studies ##
* [Snyk Customer Value Study](https://snyk.io/reports/customer-value-study-2022/)
* [Atlassian](https://snyk.io/case-studies/atlassian/): "One of the main benefits of Snyk is that it’s easier for developers to integrate into their pipelines as well." (Matthew Bass, Product Security Engineer)
* [Citrix](https://snyk.io/case-studies/citrix/): "For some tools you have to be a master of the tool to use it, but with the Snyk tool, whether you’re a developer or a manager, you can navigate the UI, understand the dashboards and make sense of the data." (Valentin Potier, Security Engineer)
* [Reddit](https://snyk.io/case-studies/reddit/): "Snyk is very dev-centric and was also easy for us to scale out without being disruptive to developers." (Spencer Koch, Reddit Security)

## How Snyk handles data ##
* [Policy](https://docs.snyk.io/more-info/how-snyk-handles-your-data)

## Roadmap ##
* [DeepCode AI Fix](https://youtu.be/R_y_G6OlX_8)
