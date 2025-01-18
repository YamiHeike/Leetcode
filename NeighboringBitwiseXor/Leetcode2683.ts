function doesValidArrayExistTS(derived: number[]): boolean {
  return derived.reduce((x, y) => x ^ y) === 0;
}
