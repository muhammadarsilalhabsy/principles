1. DRY (Don't Repeat Yourself)

    Prinsip ini mengingatkan pengembang untuk menghindari duplikasi kode. Jika ada bagian kode yang berulang, itu harus dipindahkan ke fungsi atau modul terpisah untuk digunakan kembali. Ini membantu menjaga kode tetap rapi dan mudah dipelihara.

2. KISS (Keep It Simple, Stupid)

    Prinsip ini mendorong pengembang untuk menulis kode yang sederhana dan mudah dipahami. Kode yang terlalu rumit sering kali lebih sulit untuk dipelihara dan lebih rentan terhadap bug. Fokus pada solusi yang paling sederhana dan langsung.

3. YAGNI (You Aren't Gonna Need It)

    Prinsip ini menyarankan untuk tidak menulis kode atau menambahkan fitur yang tidak langsung dibutuhkan saat ini. Fokus pada kebutuhan yang ada dan hindari menambahkan fungsionalitas ekstra yang mungkin tidak pernah digunakan.

4. Separation of Concerns (SoC)

    Prinsip ini mengutamakan pemisahan masalah atau tanggung jawab dalam kode, yang membuat setiap bagian kode fokus pada satu tugas tertentu. Misalnya, pemisahan antara logika presentasi, logika aplikasi, dan logika data. Hal ini mempermudah pemeliharaan, pengujian, dan pengembangan lebih lanjut.

5. Composition Over Inheritance

    Prinsip ini menyarankan penggunaan komposisi (menggunakan objek lain di dalam objek) daripada pewarisan dalam desain objek. Dengan komposisi, kita bisa menggabungkan berbagai fungsionalitas tanpa mengikatkan objek dengan hubungan yang kaku seperti pada pewarisan.

6. Law of Demeter (Principle of Least Knowledge)

    Prinsip ini menyarankan agar objek hanya berinteraksi dengan objek yang sangat dekat dengannya (misalnya, objek yang diberikan sebagai parameter, objek yang diciptakannya, atau objek yang dimilikinya). Ini mengurangi ketergantungan antara bagian-bagian kode dan mempermudah pengelolaan serta pengujian.

7. Fail Fast

    Prinsip ini mengingatkan untuk segera menghentikan eksekusi aplikasi ketika terjadi kesalahan, alih-alih menunggu dan memperburuk keadaan. Dengan cara ini, kesalahan bisa lebih cepat ditemukan dan diperbaiki, serta meminimalisir dampak kerusakan lebih lanjut.

8. Avoid Premature Optimization

    Prinsip ini mengatakan agar tidak terlalu cepat mengoptimalkan kode sebelum mengetahui apakah optimasi tersebut benar-benar dibutuhkan. Fokus pada menulis kode yang jelas dan benar terlebih dahulu, baru kemudian optimasi dilakukan jika diperlukan.

9. Encapsulation

    Encapsulation atau enkapsulasi berarti menyembunyikan detail implementasi dalam kelas atau objek dan hanya menyediakan antarmuka (interface) yang diperlukan. Hal ini mencegah akses langsung ke data internal objek dan memastikan bahwa data hanya dapat dimodifikasi dengan cara yang dikendalikan.

10. Tight Cohesion

    Prinsip ini mendorong pengembang untuk memastikan bahwa elemen-elemen dalam sebuah modul atau kelas sangat terkait erat satu sama lain, sehingga masing-masing bagian bekerja secara efisien dan terorganisir dengan baik. Semakin erat kaitannya, semakin mudah memelihara dan menguji kode.

11. Loose Coupling

    Prinsip ini menyarankan agar komponen atau modul dalam program saling bergantung sesedikit mungkin satu sama lain. Ini memudahkan penggantian atau perubahan modul tanpa mempengaruhi bagian lain dari sistem.

12. Principle of Least Astonishment

    Prinsip ini menyarankan agar kode dan antarmuka pengguna didesain sedemikian rupa sehingga tidak membingungkan atau mengejutkan pengguna atau pengembang lainnya. Sebaiknya, perilaku sistem harus konsisten dengan apa yang diharapkan oleh pengguna atau pengembang.

13. Don't Make Me Think

    Prinsip ini sangat berkaitan dengan desain antarmuka pengguna (UI) dan kode yang mudah dimengerti. Kode atau antarmuka yang baik adalah yang membuat pengguna atau pengembang tidak perlu berpikir keras untuk memahami cara kerjanya.

14. Be Lazy (Lazy Evaluation)

    Prinsip ini mendorong penggunaan evaluasi malas (lazy evaluation), yang artinya hanya menghitung atau mengevaluasi sesuatu ketika benar-benar dibutuhkan, bukan sebelumnya. Ini dapat meningkatkan kinerja dan menghindari operasi yang tidak perlu.

15. Prefer Small Commits

    Prinsip ini menyarankan pengembang untuk melakukan perubahan dalam kode secara bertahap dan membuat commit kecil dan terpisah, bukan melakukan perubahan besar dalam satu commit. Hal ini membantu melacak perubahan dengan lebih mudah dan mengurangi risiko bug.

16. Testability

    Kode yang baik harus mudah untuk diuji. Prinsip ini menekankan pentingnya membuat kode yang dapat diuji secara unit atau integrasi. Dengan mengoptimalkan kode untuk pengujian, pengembang dapat lebih mudah mendeteksi masalah atau kesalahan.

17. Continuous Refactoring

    Prinsip ini mengingatkan pengembang untuk secara teratur memperbaiki dan memperbarui kode tanpa menunggu masalah besar. Refactoring yang berkelanjutan memastikan bahwa kode tetap bersih dan dapat beradaptasi dengan perubahan kebutuhan atau teknologi.

18. Principle of Least Privilege

    Prinsip ini mengarah pada pembatasan hak akses pengguna dan komponen hanya pada apa yang benar-benar mereka butuhkan untuk melaksanakan tugasnya. Ini meningkatkan keamanan dan mengurangi potensi risiko kerusakan sistem.