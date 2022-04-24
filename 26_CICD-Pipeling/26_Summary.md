### Testing CI/CD Pipeline
>Poin Poin yang dipelajari
1. Introduction CI/CD
2. CI/CD Tools
3. 

>Introduction
```
Outlines:
- Introduction
- What good CI/CD
- CI/CD Process
- Benefits and Cost
- CI/CD Tools
- Github
- Practice

CI or Continuous Integration
adalah sebuah praktek unutk mengintegrasi kode menjadi repositori bersama dan membuat atau testing setiap perubahan secara otomatis, secepat mungkin dan biasanya beberapa kali sehari.

CD or Continuous Delivery / Development
adalah perangkat lunak dapat di released ke produksi setiap saat, dan secara otomatis melakukan push perubahan pada sistem.

What Makes Good CI
- Decoupled Stages
- Repeatables
- Fail Fast

What Makes Good CD
- Design with system in mind
- Pipelines
- Globally Unique Version

Benefits CI
- Detecting bug in early stage
- reduces bug
- Development progress more transparent
- Efficient

Benefits CD
- Reduce Risk
- Painless development
- Reduce Cost
- Automated and Transparent
- Releases more freq

CI Cost
- Write Automated Test
- Server for Automated
- Merge code as often

CD Cost
- Strong foundation
- Need Highest quality of test
- Documentation needs to be updated freq
```

>CI/CD Tools
```
- Jenkins
Open souce automation tool yang dibuat untuk java dengan plugins untuk CI

- Bamboo
CI build server yang dapat melakukan automatic build/test/ dan release

- CircleCi
Fleksibel CI Tools untuk berjalan di environment manapun dan memiiki cross platform mobile app.

- AWS CODE
CI/CD Tools untuk developer membuat dan testing code pada skala yang besar

- Azure Devops
CI/CD Tools yang dapat digunakan untuk planning testing, deploying dan distributing dari microsoft

- CI/CO


- Travis Ci
Travis CI adalah layanan CI pertama, ini mengenalkan cara pendekatan pembuatan kode pada cloud.

- Github Action
CI / CD Platform yang dapat melakukan build,test,dan deployment pipeline otomatis.
```

>Github Actions
```
Component
- Workflow
- Jobs
- Actions
- Events
- Runners

```

>Summary
```
Apa itu CI/CD?
Continuous integration (CI) adalah pengintegrasian kode ke dalam repositori kode kemudian menjalankan pengujian secara otomatis, cepat, dan sering. Kamu dapat melakukan CI ini dengan menggunakan perintah  commit.

Sementara continous delivery atau continuous deployment (CD) adalah praktik yang dilakukan setelah proses CI selesai dan seluruh kode berhasil terintegrasi, sehingga aplikasi bisa dibangun lalu dirilis secara otomatis.

CI/CD pipeline ini sangat lazim digunakan dalam pengembangan perangkat lunak. CI/CD pipeline ini menjadi penghubung antara tim pengembang dengan tim operasional yang di dalamnya terdapat tiga fase yang berupa continuous integration, continuous delivery, dan continuous  deployment. Ketiga fase tersebut akan dilakukan secara terus menerus dan otomatis untuk mendapatkan perangkat lunak yang andal dan bebas dari bug.

Manfaat dari CI/CD
Setelah mengetahui pengertian dari CI/CD, sekarang kita akan membahas manfaat dari penggunaan CI/CD dalam pengembangan perangkat lunak. Berikut ini adalah manfaatnya:

Mendapat feedback lebih cepat
Dalam penggunaan CI/CD pipeline ini kode akan diuji coba secara bersamaan agar proses pengembangan perangkat lunak dapat berjalan dengan seimbang. Uji coba dilakukan dengan CI tool. Tanggapan atau error yang terjadi juga bisa didapatkan lebih cepat sehingga tim pengembang pun dapat langsung menindaklanjuti feedback tersebut secepat mungkin.

Dapat mendeteksi bug lebih cepat
Seperti yang dikatakan sebelumnya, CI/CD ini bekerja dengan melakukan pengujian secara otomatis, sehingga jika ada bug yang muncul pada aplikasi yang dikembangkan maka akan langsung terdeteksi oleh CI tool. Pengembang juga dapat dengan mudah menemukan dan memperbaiki bug tersebut.

Dapat mempercepat proses rilis
Proses rilis dari suatu aplikasi dapat mungkin dapat dipercepat. Hal itu disebabkan kode-kode yang terus digabungkan dan diterapkan ke dalam produk, sehingga aplikasi selalu dalam kondisi siap untuk dirilis kapan pun.

Tools untuk CI/CD
Ada beberapa tools yang dapat digunakan dalam proses CI/CD. Berikut ini adalah tools yang dapat kamu gunakan:

Jenkins
Tool yang pertama adalah Jenkins. Jenkins adalah salah satu CI/CD tool yang sering digunakan. Jenkins ini bersifat open source dan menggunakan bahasa pemrograman Java. Tool ini juga dapat digunakan pada berbagai sistem operasi seperti Windows, macOS, dan Linux.

Tool ini memiliki banyak plugins yang dapat dimanfaatkan untuk membuat, men-deploy, dan melakukan otomatisasi dalam proses pengembangan perangkat lunak.

AWS Codebuild
Tool berikutnya ada AWS Codebuild. Seperti namanya tool ini dikembangkan oleh AWS. Tool ini memungkinkan pengembang untuk mem-build dan menguji kode secara berkelanjutan. Selain itu tool ini juga aman dan dapat melakukan automasi.

Azure DevOps
Jika kamu masih belum mendapatkan tool CI/CD yang sesuai untuk kamu gunakan, mungkin Azure DevOps ini dapat kamu coba. Ia dapat diandalkan untuk mengatur, testing,hingga melakukan deploy untuk aplikasi. Tool ini diciptakan oleh Microsoft dan dapat berjalan pada berbagai sistem operasi, mulai dari Windows, macOS, hingga Linux.

GitLab CI/CD
Tool yang terakhir adalah Gitlab CI/CD. Tool ini dibuat dan dikembangkan oleh GitLab. Tools ini dapat dimanfaatkan untuk pengembangan perangkat lunak mulai dari awal hingga akhir. Tool ini bekerja dengan menggunakan tiga metode, yaitu continuous integration, continuous delivery, dan continuous deployment. Fitur lain yang ditawarkan oleh tool ini adalah, ia dapat mengerjakan proyek di virtual machine, docker container, atau server lainnya.
Jadi, apa itu CI/CD?
Jadi, CI/CD adalah salah satu praktik DevOps yang digunakan untuk pengembangan perangkat lunak menjadi lebih terorganisir. Penggunaan CI/CD pada pengembangan aplikasi memberikan banyak manfaat yang akan langsung terasa oleh tim pengembang. Selain itu, ada banyak pilihan tool atau alat yang dapat digunakan untuk mendukung berjalannya proses CI/CD ini secara otomatis dan aman.
```