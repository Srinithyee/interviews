// You are given an n x n 2D matrix representing an image.

// Rotate the image by 90 degrees (clockwise).

// Follow up:
    // Could you do this in-place?

#First do the transpose of the matrix and then reverse it.

for row in range(len(matrix[0])):
    for col in range(row,len(matrix[0])):
        matrix[row][col],matrix[col][row] = matrix[col][row],matrix[row][col]
        
for i in matrix:
    i.reverse()
return matrix

