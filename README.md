Git paylanmış VSC-dir(version control system), bununla bərabər protokollar toplusudur. Bu protokollar toplusu ilə işləyən müəyyən serverlər vardır ki, bunlar layihələrin hazırlanmasında, qrup şəklində toplu işdə və hazırlanan layihənin qaynaqlarını toplu şəkildə və daha təhlükəsiz şəkildlə saxlamaq kimi məsələlər üçün əlverişli düşünülüb hazırlanmışdır. Git-də istifadəçilər komanda yoldaşlarının layihə üzərindəki dəyişikliklərini görüb ona uyğun şəkildə işin özünə düşən hissəsini yerinə yetirin həmçinin bu srverlərə göndərə bilir. Version Control System adı da layihə üzərindəki son dəyişiklikəri izləyə bilməyimizə əsasən ortaya çıxıb. Bunlardan əlavə olaraq həmin serverlərdə layihələrin saxlanılması daha təhlükəsizdir. Layihəni hər hansı bir kompüterin yaddaşında saxlayacaq olsaq, proqram və yaxud aparat təminatında çıxa biləcək hər hansı bir problem layihəmizi saxladığımız qovluğa təhlükə yarada bilər, lakin bu serverlərdən istifadə edən şirkətlər öz domenlərini alıb private şəkildə layihələrinin remote repository-ni hazırlayıb daha təhlükəsiz və əlverişli şəkildə layihələrini saxlayırlar.

Bu serverlərə misal: GitHub, GitLab, BitBucket, BeanStalk, CodeBase, Assembla və s. ola bilər.

İşlədiyimiz mühitlə Git serverini əlaqələndirərkən arada 4 təbəqə olur:
1. Working directory - işlədiyimiz mühitdə kodu yazdığımız sahə
2. Staging - ara təbəqə
3. Local repository - kompüterimizdə olan .git qovluğu(Mühitdə yazdığımız kodları commit ilə buraya göndəririk)
4. Remote repository - git serverimiz

Git commands: 
(git init) - bu əmr bizim layihəni yazdığımız mühitin qovluğunun içərisində .git adlı hidden qovluq yaradır.
(git remote add origin ...) - bu əmrlə biz local repository ilə remote repository arasındakı əlaqəni təmin edirik (nöqtələrin yerinə remote repository'nin linkini qeyd edirik).
(git add .) - bu əmr working directorydə yazdığımız kodları staging qaıtna keçirmək üçün istifadə olunur, əmrin sonundakı nöqtə isə cari qovluqdakı bütün faylları stagingə daşımaq istədiyimizi bildirir.
(git commit -m "Message")
