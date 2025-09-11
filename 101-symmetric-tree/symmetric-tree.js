var isSymmetric = function (root) {
    function isMirror(p, q) {
        if (!p && !q) return true;

        if (!p || !q) return false;

        return (p.val==q.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }

    if (!root) return true;
    return isMirror(root.left, root.right);

};
