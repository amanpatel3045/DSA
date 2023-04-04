for (var i = 0; i < N; i++) {
    for (var j = 0; j < M; j++) {
        var bag = "";
        for (var k = 0; k < K; k++) {
            bag += array[i][j][k] + " ";
        }
        console.log(bag);
    }
}
