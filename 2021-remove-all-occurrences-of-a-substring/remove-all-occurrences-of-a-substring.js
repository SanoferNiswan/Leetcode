/**
 * @param {string} s
 * @param {string} part
 * @return {string}
 */
const removeOccurrences = f = (s,part) => {
   return s.includes(part) ? f(s.replace(part,''),part):s;
}
