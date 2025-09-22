function countConsistentStrings(allowed, words) {
    const set = new Set(allowed);
    return words.reduce((r, w) => r + +w.split('').every((c) => set.has(c)), 0);
}