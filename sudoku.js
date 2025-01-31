function verifySudokuBoard(board) {
    let rowsSet = Array.from({ length: 9 }, () => new Set());
    let colsSet = Array.from({ length: 9 }, () => new Set());
    let subgridSets = Array.from({ length: 3 }, () => Array.from({ length: 3 }, () => new Set()));
    
    for (let r = 0; r < 9; r++) {
        for (let c = 0; c < 9; c++) {
            let num = board[r][c];
            if (num === 0) continue;
            
            if (rowSets[r].has(num) || colsSet[c].has(num) || subgridSets[Math.floor(r / 3)][Math.floor(c / 3)].has(num)) {
                return false;
            }
            
            rowSets[r].add(num);
            colsSet[c].add(num);
            subgridSets[Math.floor(r/3)][Math.floor(c/3)].add(num);
        }
    }
    return false;
}
