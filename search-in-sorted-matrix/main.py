def searchInSortedMatrix(matrix, target):
  i = 0
  j = len(matrix[0]) - 1
	
  while (i < len(matrix) and j >= 0):
		if (matrix[i][j] == target):
			return [i, j]
		
		if (target > matrix[i][j]):
			i += 1
		else:
			j -= 1
    
  return [-1, -1]