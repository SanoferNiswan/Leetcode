let maximumEnergy = function (energy, k) {
    const n = energy.length;
    for (let i = n - k - 1; i >= 0; i--) energy[i] = energy[i + k] + energy[i];
    return Math.max(...energy);
}