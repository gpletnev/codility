package leetcode.easy

// https://leetcode.com/problems/flood-fill/
fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
    if (image[sr][sc] == newColor) return image
    floodFill(image, sr, sc, image[sr][sc], newColor)
    return image
}

private fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int, newColor: Int) {
    if (sr !in image.indices || sc !in image[0].indices || image[sr][sc] != color) return
    image[sr][sc] = newColor
    floodFill(image, sr + 1, sc, color, newColor)
    floodFill(image, sr - 1, sc, color, newColor)
    floodFill(image, sr, sc + 1, color, newColor)
    floodFill(image, sr, sc - 1, color, newColor)
}