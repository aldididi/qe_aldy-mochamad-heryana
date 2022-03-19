# Summary REST API Testing

## Apa itu API testing?

API tes sangat berbedan dengan UI test, dapat mengirim request langsung ke server dan mendapatkan response secara cepat, lalu untuk melakukan verifikasi respon dan error handling yang dibutuhkan

### Beberapa jenis API Test

- Functionality
- Load test
- Security

### Beberapa tools yang digunakan

- Postman
- Jmeter
- Frisby.js
- Rest-assured

Hal yang membedakan antara unit test dan API test antara lain:

### Unit test

- dibuat dan dilakukan oleh dev
- setiap fungsinya terpisah
- dev bisa langsung akses ke source code
- functional dasar yang dapat diuji
- scope terbatas
- biasanya dilakuakan sebelum tahap build

### API Test

- test perform
- end to end
- tak bisa akses ke source code
- hanya akses fungsi API
- semua functional issue
- scope pengujian luas
- dilakukan setelah build

## API TESTING PROCESS

- Specification review
- Specification development
- Framework development
- test case development
- execution and report

### Tipe bugs yang dideteksi oleh API Test

- Gagal melakukan error handling pada keadaan tertentu
- Tidak dapat menyambing dan dapat respon API
- Isu keamanan
- Performance issue
- Warning/error yang tidak tepat
- Struktur data respon tidak sesuai (json/xml)
