/**
 * @param {number[]} derived
 * @return {boolean}
 */
var doesValidArrayExist = function (derived) {
  return derived.reduce((x, y) => x ^ y) === 0;
};
