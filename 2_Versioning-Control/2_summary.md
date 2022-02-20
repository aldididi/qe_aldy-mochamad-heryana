# Resume Materi GIT Versioning Control

> GIT = Git Versioning Control sebuah teknologi yang digunakan para developer untuk mengatur versi dari source code program

Secara general GIT selain digunakan untuk mengatur versi, mencatat setiap perubahan,  juga digunakan untuk berkolaborasi dan bersinkronisasi dengan para developer lainnya dalam 1 proyek yang sama. 

Ada beberapa layanan versioning control yang jamak digunakan para developer yaitu github, gitlab, bitbucket dan masih banyak lainnya. 

Pada tahap instalasi dapat langsung download di website resmi dan install git, untuk di Linux based bisa menggunakan command “sudo apt-get install git”. Setelah instalasi dapat melakukan konfigurasi akun git pada perangkat yang digunakan menggunakan command “git config –global user.name “user name” dan  “git config –global user.email “user email”.

Untuk melakukan penambahan proyek yang sudah ada ke dalam repository yang baru saja dibuat dapat menggunakan
```
git init
git remote add <remote_name> <remote_repo_url>
git push -u <remote_name> <local branch name>
```

Untuk melakukan klon repository ke pada komputer lokal menggunakan command
```
git clone url repository
```
### Beberapa fungsi command git
```
Git status    : untuk menampilkan status git branch yang sedang digunakan sekarang
Git add    : untuk menambahkan file ke dalam antrean/stagged untuk dikomit, dapat juga menggunakan “git add .” untuk menambahkan seluruh file ke dalam antrean.
Commit     : untuk melakukan komit dan sudah siap untuk dilakukan push, biasanya ditambah dengan “-m” untuk ditambahkan message commit. “Git commit -m ‘adding update feature A’”.
Git reset    : Untuk reset perubahan yang ada pada branch yang sudah dicommit sebelumnya.
```

### SYNC
Untuk melakukan sinkronisasi proyek yang sudah update oleh developer lain menggunakan command `git fetch`, `git pull origin origin master`. Untuk melakukan push/upload pekerjaan yang sudah kita buat setelah melakukan command commit maka dilakukan command `git push origin <branch_name>`.

### BRANCH
Membuat branch baru     : `git branch <nama branch>`
Hapus branch            : `git branch -D <nama branch>`
Menampilkan branch remote: `git branch -a`
Pindah branch        : `git checkout <nama branch>`
Menyatukan branch        : `git merge <nama branch>`

![Visualisasi branching](https://imron02.files.wordpress.com/2014/01/6191e-untitled.png)