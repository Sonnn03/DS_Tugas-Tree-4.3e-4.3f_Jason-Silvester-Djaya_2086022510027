4.3h Under what conditions would a pre-order and a breadth-first-transversal be the same?
      = Kondisi pre-order dan breadth-first-transversal akan menghasilkan urutan yang sama hanya bisa dalam kondisi khusus, 
        yaitu ketika struktur treenya tidak bercabang (artinya setiap node hanya memiliki paling banyak 1 child).

4.3i Suppose a directory structure has N files stored in a directories, Answer the following questions: 
  A. What is the run time of a traversal that prints out the directory names?
      =Runtimenya adalah O(D) (linear terhadap jumlah directory) karena setiap directoy dikunjungi 1 kali , sehingga tidak ada directory
        yang dikunjungi ulang, dan juga tidak ada perintah tambahan selain print
  B. What is the run time of a traversal that prints out the file name?
      = Runtimenya adalah O(N), karena setiap filenya harus ditemukan melalui traversal, setiap file dicetak cuma sekali, 
        tidak ada file yang dilewati
