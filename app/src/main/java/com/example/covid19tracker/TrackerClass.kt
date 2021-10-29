package com.example.covid19tracker

import com.google.gson.annotations.SerializedName

data class TrackerClass(
    @SerializedName("State Unassigned") val stateUnassigned: StateData?,
    @SerializedName("Andaman and Nicobar Islands") val anman: AndamanandNicobarData?,
    @SerializedName("Bihar") val bihar: BirahData?,
    @SerializedName("Chandigarh") val chandigarh: ChanData?,
    @SerializedName("Andhra Pradesh") val andhraPradesh: AndhraPradeshData,
    @SerializedName("Arunachal Pradesh") val arunachalPradesh: ArunachalPradeshData?,
    @SerializedName("Assam") val assam: AssamData?,
    @SerializedName("Chhattisgarh") val chhattisgarh: ChhattisgarhData,
    @SerializedName("Dehli") val dehli: DehliData?,
    @SerializedName("Dadra and Nagar Haveli and Daman and Diu") val DadraandNagar: DadraandNagarData?,
    @SerializedName("Goa") val goa: GoaData?,
    @SerializedName("Gujarat") val gujarat: GujaratData,
    @SerializedName("Himachal Pradesh") val himachalPradesh: HimachalPradeshData?,
    @SerializedName("Haryana") val haryana: HaryanaData,
    @SerializedName("Jharkhand") val Jharkhand: JharkhandData,
    @SerializedName("Jammu and Kashmir") val jammuKashmir: JammuandKashmirData,
    @SerializedName("Karnataka") val karnataka: KarnatakaData,
    @SerializedName("Kerala") val kerala: KeralaData,
    @SerializedName("Ladakh") val ladakh: LadakhData,
    @SerializedName("Lakshadweep") val Lakshadweep: LakshadweepData,
    @SerializedName("Maharashtra") val maharashtra: MaharashtraData,
    @SerializedName("Meghalaya") val meghalaya: MeghalayaData,
    @SerializedName("Manipur") val manipur: ManipurData,
    @SerializedName("Madhya Pradesh") val madhyaPradesh: MadhyaPradeshData,
    @SerializedName("Mizoram") val mizoram: MizoramData,
    @SerializedName("Nagaland") val nagaland: NagalandData,
    @SerializedName("Odisha") val odisha: OdishaData,
    @SerializedName("Punjab") val punjab: PunjabData,
    @SerializedName("Puducherry") val puducherry: PuducherryData,
    @SerializedName("Rajasthan") val rajasthan: RajasthanData,
    @SerializedName("Sikkim") val sikkim: SikkimData,
    @SerializedName("Telangana") val telangana: TelanganaData,
    @SerializedName("Tamil Nadu") val tamilNadu: TamilNaduData,
    @SerializedName("Tripura") val tripura: TripuraData,
    @SerializedName("Uttar Pradesh") val uttarPradesh: UttarPradeshData,
    @SerializedName("Uttarakhand") val uttarakhand: UttarakhandData,
    @SerializedName("West Bengal") val westBengal: WestBengalData
    )


data class WestBengalData(
    val districtData: WestBengalList,
    val statecode: String
)

data class WestBengalList(
    @SerializedName("Alipurduar") val alipurduar: DataModel,
    @SerializedName("Bankura") val bankura: DataModel,
    @SerializedName("Birbhum") val birbhum: DataModel,
    @SerializedName("Cooch Behar") val coochBehar: DataModel,
    @SerializedName("Dakshin Dinajpur") val dakshinDinajpur: DataModel,
    @SerializedName("Darjeeling") val darjeeling: DataModel,
    @SerializedName("Hooghly") val hooghly: DataModel,
    @SerializedName("Howrah") val howrah: DataModel,
    @SerializedName("Jalpaiguri") val jalpaiguri: DataModel,
    @SerializedName("Jhargram") val jhargram: DataModel,
    @SerializedName("Kalimpong") val kalimpong: DataModel,
    @SerializedName("Kolkata") val kolkata: DataModel,
    @SerializedName("Malda") val malda: DataModel,
    @SerializedName(" Murshidabad") val murshidabad: DataModel,
    @SerializedName("Nadia") val nadia: DataModel,
    @SerializedName("North 24 Parganas") val northParganas: DataModel,
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Paschim Bardhaman") val paschimBardhaman: DataModel,
    @SerializedName("Paschim Medinipur") val paschimMedinipur: DataModel,
    @SerializedName("Purba Bardhaman") val purbaBardhaman: DataModel,
    @SerializedName(" Purba Medinipur") val purbaMedinipur: DataModel,
    @SerializedName("Purulia") val purulia: DataModel,
    @SerializedName("South 24 Parganas") val southParganas: DataModel,
    @SerializedName("Uttar Dinajpur") val uttarDinajpur: DataModel
    )

data class UttarakhandData(
    val districtData: UttarakhandList,
    val statecode: String
)

data class UttarakhandList(
    @SerializedName("Almora") val almora: DataModel,
    @SerializedName("Bageshwar") val bageshwar: DataModel,
    @SerializedName("Chamoli") val chamoli: DataModel,
    @SerializedName("Champawat") val champawat: DataModel,
    @SerializedName("Dehradun") val dehradun: DataModel,
    @SerializedName("Haridwar") val haridwar: DataModel,
    @SerializedName("Nainital") val nainital: DataModel,
    @SerializedName("Pauri Garhwal") val pauriGarhwal: DataModel,
    @SerializedName("Pithoragarh") val pithoragarh: DataModel,
    @SerializedName("Rudraprayag") val rudraprayag: DataModel,
    @SerializedName("Tehri Garhwal") val tehriGarhwal: DataModel,
    @SerializedName("Udham Singh Nagar") val udhamSinghNagar: DataModel,
    @SerializedName("Uttarkashi") val uttarkashi: DataModel
)

data class UttarPradeshData(
    val districtData: UttarPradeshList,
    val statecode: String
)

data class UttarPradeshList(
    @SerializedName("Agra") val agra: DataModel,
    @SerializedName("Aligarh") val aligarh: DataModel,
    @SerializedName("Ambedkar Nagar") val ambedkarNagar: DataModel,
    @SerializedName("Amethi") val amethi: DataModel,
    @SerializedName("Amroha") val amroha: DataModel,
    @SerializedName("Auraiya") val auraiya: DataModel,
    @SerializedName("Ayodhya") val ayodhya: DataModel,
    @SerializedName("Azamgarh") val azamgarh: DataModel,
    @SerializedName("Baghpat") val baghpat: DataModel,
    @SerializedName("Bahraich") val bahraich: DataModel,
    @SerializedName("Ballia") val ballia: DataModel,
    @SerializedName("Balrampur") val balrampur: DataModel,
    @SerializedName("Banda") val banda: DataModel,
    @SerializedName("Barabanki") val barabanki: DataModel,
    @SerializedName("Bareilly") val bareilly: DataModel,
    @SerializedName("Basti") val basti: DataModel,
    @SerializedName("Bhadohi") val bhadohi: DataModel,
    @SerializedName("Bijnor") val bijnor: DataModel,
    @SerializedName("Budaun") val budaun: DataModel,
    @SerializedName("Bulandshahr") val bulandshahr: DataModel,
    @SerializedName("Chandauli") val chandauli: DataModel,
    @SerializedName("Chitrakoot") val chitrakoot: DataModel,
    @SerializedName("Deoria") val deoria: DataModel,
    @SerializedName("Etah") val etah: DataModel,
    @SerializedName("Etawah") val etawah: DataModel,
    @SerializedName("Farrukhabad") val farrukhabad: DataModel,
    @SerializedName("Fatehpur") val fatehpur: DataModel,
    @SerializedName("Firozabad") val firozabad: DataModel,
    @SerializedName("Gautam Buddha Nagar") val gautamBuddhaNagar: DataModel,
    @SerializedName("Ghaziabad") val ghaziabad: DataModel,
    @SerializedName("Ghazipur") val ghazipur: DataModel,
    @SerializedName("Gonda") val gonda: DataModel,
    @SerializedName("Gorakhpur") val gorakhpur: DataModel,
    @SerializedName("Hamirpur") val hamirpur: DataModel,
    @SerializedName("Hapur") val hapur: DataModel,
    @SerializedName("Hardoi") val hardoi: DataModel,
    @SerializedName("Hathras") val hathras: DataModel,
    @SerializedName("Jalaun") val jalaun: DataModel,
    @SerializedName("Jaunpur") val jaunpur: DataModel,
    @SerializedName("Jhansi") val jhansi: DataModel,
    @SerializedName("Kannauj") val kannauj: DataModel,
    @SerializedName("Kanpur Dehat") val kanpurDehat: DataModel,
    @SerializedName("Kanpur Nagar") val kanpurNagar: DataModel,
    @SerializedName("Kasganj") val kasganj: DataModel,
    @SerializedName("Kaushambi") val kaushambi: DataModel,
    @SerializedName("Kushinagar") val kushinagar: DataModel,
    @SerializedName("Lakhimpur Kheri") val lakhimpurKheri: DataModel,
    @SerializedName("Lalitpur") val lalitpur: DataModel,
    @SerializedName("Lucknow") val lucknow: DataModel,
    @SerializedName("Maharajganj") val maharajganj: DataModel,
    @SerializedName("Mahoba") val mahoba: DataModel,
    @SerializedName("Mainpuri") val mainpuri: DataModel,
    @SerializedName("Mathura") val mathura: DataModel,
    @SerializedName("Mau") val mau: DataModel,
    @SerializedName("Meerut") val meerut: DataModel,
    @SerializedName("Mirzapur") val mirzapur: DataModel,
    @SerializedName("Moradabad") val moradabad: DataModel,
    @SerializedName("Muzaffarnagar") val muzaffarnagar: DataModel,
    @SerializedName("Pilibhit") val pilibhit: DataModel,
    @SerializedName("Pratapgarh") val pratapgarh: DataModel,
    @SerializedName("Prayagraj") val prayagraj: DataModel,
    @SerializedName("Rae Bareli") val raeBareli: DataModel,
    @SerializedName("Rampur") val rampur: DataModel,
    @SerializedName("Saharanpur") val saharanpur: DataModel,
    @SerializedName("Sambhal") val sambhal: DataModel,
    @SerializedName("Sant Kabir Nagar") val santKabirNagar: DataModel,
    @SerializedName("Shahjahanpur") val shahjahanpur: DataModel,
    @SerializedName("Shamli") val shamli: DataModel,
    @SerializedName("Shrawasti") val shrawasti: DataModel,
    @SerializedName("Siddharthnagar") val siddharthnagar: DataModel,
    @SerializedName("Sitapur") val sitapur: DataModel,
    @SerializedName("Sonbhadra") val sonbhadra: DataModel,
    @SerializedName("Sultanpur") val sultanpur: DataModel,
    @SerializedName("Unnao") val unnao: DataModel,
    @SerializedName("Varanasi") val varanasi: DataModel
)

data class TripuraData(
    val districtData: TripuraList,
    val statecode: String
)

data class TripuraList(
    @SerializedName("Dhalai") val dhalai: DataModel,
    @SerializedName("Gomati") val gomati: DataModel,
    @SerializedName("Khowai") val khowai: DataModel,
    @SerializedName("North Tripura") val northTripura: DataModel,
    @SerializedName("Sipahijala") val sipahijala: DataModel,
    @SerializedName("South Tripura") val southTripura: DataModel,
    @SerializedName("Unokoti") val unokoti: DataModel,
    @SerializedName("West Tripura") val westTripura: DataModel
)

data class TamilNaduData(
    val districtData: TamilNaduList,
    val statecode: String
)

data class TamilNaduList(
    @SerializedName("Railway Quarantine") val railwayQuarantine: DataModel,
    @SerializedName("Airport Quarantine") val airportQuarantine: DataModel,
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Ariyalur") val ariyalur: DataModel,
    @SerializedName("Chengalpattu") val chengalpattu: DataModel,
    @SerializedName("Chennai") val chennai: DataModel,
    @SerializedName("Coimbatore") val coimbatore: DataModel,
    @SerializedName("Cuddalore") val cuddalore: DataModel,
    @SerializedName("Dharmapuri") val dharmapuri: DataModel,
    @SerializedName("Dindigul") val dindigul: DataModel,
    @SerializedName("Erode") val erode: DataModel,
    @SerializedName("Kallakurichi") val kallakurichi: DataModel,
    @SerializedName("Kancheepuram") val kancheepuram: DataModel,
    @SerializedName("Kanyakumari") val kanyakumari: DataModel,
    @SerializedName("Karur") val karur: DataModel,
    @SerializedName("Krishnagiri") val krishnagiri: DataModel,
    @SerializedName("Madurai") val madurai: DataModel,
    @SerializedName("Nagapattinam") val nagapattinam: DataModel,
    @SerializedName("Namakkal") val namakkal: DataModel,
    @SerializedName("Nilgiris") val nilgiris: DataModel,
    @SerializedName("Perambalur") val perambalur: DataModel,
    @SerializedName("Pudukkottai") val pudukkottai: DataModel,
    @SerializedName("Ramanathapuram") val ramanathapuram: DataModel,
    @SerializedName("Ranipet") val ranipet: DataModel,
    @SerializedName("Salem") val salem: DataModel,
    @SerializedName("Sivaganga") val sivaganga: DataModel,
    @SerializedName("Tenkasi") val tenkasi: DataModel,
    @SerializedName("Thanjavur") val thanjavur: DataModel,
    @SerializedName("Theni") val theni: DataModel,
    @SerializedName("Thiruvallur") val thiruvallur: DataModel,
    @SerializedName("Thiruvarur") val thiruvarur: DataModel,
    @SerializedName("Thoothukkudi") val thoothukkudi: DataModel,
    @SerializedName("Tiruchirappalli") val tiruchirappalli: DataModel,
    @SerializedName("Tirunelveli") val tirunelveli: DataModel,
    @SerializedName("Tirupathur") val tirupathur: DataModel,
    @SerializedName("Tiruppur") val tiruppur: DataModel,
    @SerializedName("Mayiladuthurai") val mayiladuthurai: DataModel,
    @SerializedName("Virudhunagar") val virudhunagar: DataModel,
    @SerializedName("Viluppuram") val viluppuram: DataModel,
    @SerializedName("Vellore") val vellore: DataModel,
    @SerializedName("Tiruvannamalai") val tiruvannamalai: DataModel
)

data class TelanganaData(
    val districtData: TelanganaList,
    val statecode: String
)

data class TelanganaList(
    @SerializedName("Foreign Evacuees") val foreignEvacuees: DataModel,
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Adilabad") val adilabad: DataModel,
    @SerializedName("Bhadradri Kothagudem") val kothagudem: DataModel,
    @SerializedName("Hyderabad") val hyderabad: DataModel,
    @SerializedName("Jagtial") val jagtial: DataModel,
    @SerializedName("Jangaon") val jangaon: DataModel,
    @SerializedName("Jayashankar Bhupalapally") val bhupalapally: DataModel,
    @SerializedName("Jogulamba Gadwal") val gadwal: DataModel,
    @SerializedName("Kamareddy") val kamareddy: DataModel,
    @SerializedName("Karimnagar") val karimnagar: DataModel,
    @SerializedName("Khammam") val khammam: DataModel,
    @SerializedName("Komaram Bheem") val komarambheem: DataModel,
    @SerializedName("Mahabubabad") val mahabubabad: DataModel,
    @SerializedName("Mahabubnagar") val mahabubnagar: DataModel,
    @SerializedName("Mancherial") val mancherial: DataModel,
    @SerializedName("Medak") val medak: DataModel,
    @SerializedName("Medchal Malkajgiri") val malkajgiri: DataModel,
    @SerializedName("Mulugu") val mulugu: DataModel,
    @SerializedName("Nagarkurnool") val nagarkurnool: DataModel,
    @SerializedName("Nalgonda") val nalgonda: DataModel,
    @SerializedName("Narayanpet") val narayanpet: DataModel,
    @SerializedName("Nirmal") val nirmal: DataModel,
    @SerializedName("Nizamabad") val nizamabad: DataModel,
    @SerializedName("Peddapalli") val peddapalli: DataModel,
    @SerializedName("Rajanna Sircilla") val rajannaSircilla: DataModel,
    @SerializedName("Ranga Reddy") val rangaReddy: DataModel,
    @SerializedName("Sangareddy") val sangareddy: DataModel,
    @SerializedName("Siddipet") val siddipet: DataModel,
    @SerializedName("Suryapet") val suryapet: DataModel,
    @SerializedName("Vikarabad") val vikarabad: DataModel,
    @SerializedName("Wanaparthy") val wanaparthy: DataModel,
    @SerializedName("Warangal Rural") val warangalRural: DataModel,
    @SerializedName("Warangal Urban") val warangalUrban: DataModel,
    @SerializedName("Yadadri Bhuvanagiri") val bhuvanagiri: DataModel,
    @SerializedName("Unknown") val unknown: DataModel

    )

data class SikkimData(
    val districtData: SikkimList,
    val statecode: String
)

data class SikkimList(
    @SerializedName("East Sikkim") val eastSikkim: DataModel,
    @SerializedName("North Sikkim") val northSikkim: DataModel,
    @SerializedName("South Sikkim") val southSikkim: DataModel,
    @SerializedName("West Sikkim") val westSikkim: DataModel,
    @SerializedName("Unknown") val unknown: DataModel

    )

data class RajasthanData(
    val districtData: RajasthanList,
    val statecode: String
)

data class RajasthanList(
    @SerializedName("Ajmer") val ajmer: DataModel,
    @SerializedName("Alwar") val alwar: DataModel,
    @SerializedName("Banswara") val banswara: DataModel,
    @SerializedName("Baran") val baran: DataModel,
    @SerializedName("Barmer") val barmer: DataModel,
    @SerializedName("Bharatpur") val bharatpur: DataModel,
    @SerializedName("Bhilwara") val bhilwara: DataModel,
    @SerializedName("Bikaner") val bikaner: DataModel,
    @SerializedName("BSF Camp") val bSFCamp: DataModel,
    @SerializedName("Bundi") val bundi: DataModel,
    @SerializedName("Chittorgarh") val chittorgarh: DataModel,
    @SerializedName("Churu") val churu: DataModel,
    @SerializedName("Dausa") val dausa: DataModel,
    @SerializedName("Dholpur") val dholpur: DataModel,
    @SerializedName("Dungarpur") val dungarpur: DataModel,
    @SerializedName("Evacuees") val evacuees: DataModel,
    @SerializedName("Ganganagar") val ganganagar: DataModel,
    @SerializedName("Hanumangarh") val hanumangarh: DataModel,
    @SerializedName("Italians") val italians: DataModel,
    @SerializedName("Jaipur") val jaipur: DataModel,
    @SerializedName("Jaisalmer") val jaisalmer: DataModel,
    @SerializedName("Jalore") val jalore: DataModel,
    @SerializedName("Jhalawar") val jhalawar: DataModel,
    @SerializedName("Jhunjhunu") val jhunjhunu: DataModel,
    @SerializedName("Jodhpur") val jodhpur: DataModel,
    @SerializedName("Karauli") val karauli: DataModel,
    @SerializedName("Kota") val kota: DataModel,
    @SerializedName("Nagaur") val nagaur: DataModel,
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Pali") val pali: DataModel,
    @SerializedName("Pratapgarh") val pratapgarh: DataModel,
    @SerializedName("Rajsamand") val rajsamand: DataModel,
    @SerializedName("Sawai Madhopur") val sawaiMadhopurr: DataModel,
    @SerializedName("Sikar") val sikar: DataModel,
    @SerializedName("Sirohi") val sirohi: DataModel,
    @SerializedName("Tonk") val tonk: DataModel,
    @SerializedName("Udaipur") val udaipur: DataModel
)

data class PuducherryData(
    val districtData: PuducherryList,
    val statecode: String
)

data class PuducherryList(
    @SerializedName("Karaikal") val karaikal: DataModel,
    @SerializedName("Mahe") val mahe: DataModel,
    @SerializedName("Puducherry") val puducherry: DataModel,
    @SerializedName("Yanam") val yanam: DataModel
)

data class PunjabData(
    val districtData: PunjabList,
    val statecode: String
)

data class PunjabList(
    @SerializedName("Amritsar") val amritsar: DataModel,
    @SerializedName("Barnala") val barnala: DataModel,
    @SerializedName("Faridkot") val faridkot: DataModel,
    @SerializedName("Fatehgarh Sahib") val fatehgarhSahib: DataModel,
    @SerializedName("Fazilka") val fazilka: DataModel,
    @SerializedName("Ferozepur") val ferozepur: DataModel,
    @SerializedName("Gurdaspur") val gurdaspur: DataModel,
    @SerializedName("Hoshiarpur") val hoshiarpur: DataModel,
    @SerializedName("Jalandhar") val jalandhar: DataModel,
    @SerializedName("Kapurthala") val kapurthala: DataModel,
    @SerializedName("Ludhiana") val ludhiana: DataModel,
    @SerializedName("Mansa") val mansa: DataModel,
    @SerializedName("Moga") val moga: DataModel,
    @SerializedName("Pathankot") val pathankot: DataModel,
    @SerializedName("Patiala") val patiala: DataModel,
    @SerializedName("Rupnagar") val rupnagar: DataModel,
    @SerializedName("S.A.S. Nagar") val nagar: DataModel,
    @SerializedName("Sangrur") val sangrur: DataModel,
    @SerializedName("Shahid Bhagat Singh Nagar") val singhNagar: DataModel,
    @SerializedName("Sri Muktsar Sahib") val muktsarSahib: DataModel,
    @SerializedName("Tarn Taran") val tarnTaran: DataModel
)

data class OdishaData(
    val districtData: OdishaList,
    val statecode: String
)

data class OdishaList(
    @SerializedName("State Pool") val statePool: DataModel,
    @SerializedName("Others") val others: DataModel,
    @SerializedName("Angul") val angul: DataModel,
    @SerializedName("Balangir") val balangir: DataModel,
    @SerializedName("Balasore") val balasore: DataModel,
    @SerializedName("Bargarh") val bargarh: DataModel,
    @SerializedName("Bhadrak") val bhadrak: DataModel,
    @SerializedName("Boudh") val boudh: DataModel,
    @SerializedName("Cuttack") val cuttack: DataModel,
    @SerializedName("Deogarh") val deogarh: DataModel,
    @SerializedName("Dhenkanal") val denkanal: DataModel,
    @SerializedName("Gajapati") val gajapati: DataModel,
    @SerializedName("Ganjam") val ganjam: DataModel,
    @SerializedName("Jagatsinghpur") val jagatsinghpur: DataModel,
    @SerializedName("Jajpur") val jajpur: DataModel,
    @SerializedName("Jharsuguda") val jharsuguda: DataModel,
    @SerializedName("Kalahandi") val kalahandi: DataModel,
    @SerializedName("Kandhamal") val kandhamal: DataModel,
    @SerializedName("Kendrapara") val kendrapara: DataModel,
    @SerializedName("Kendujhar") val kendujhar: DataModel,
    @SerializedName("Khordha") val khordha: DataModel,
    @SerializedName("Koraput") val koraput: DataModel,
    @SerializedName("Malkangiri") val malkangiri: DataModel,
    @SerializedName("Mayurbhanj") val mayurbhanj: DataModel,
    @SerializedName("Nabarangapur") val nabarangapur: DataModel,
    @SerializedName("Nayagarh") val nayagarh: DataModel,
    @SerializedName("Nuapada") val nuapada: DataModel,
    @SerializedName("Puri") val puri: DataModel,
    @SerializedName("Rayagada") val rayagada: DataModel,
    @SerializedName("Sambalpur") val sambalpur: DataModel,
    @SerializedName("Subarnapur") val subarnapur: DataModel,
    @SerializedName("Sundargarh") val sundargarh: DataModel


    )

data class NagalandData(
    val districtData: NagalandList,
    val statecode: String
)

data class NagalandList(
    @SerializedName("Others") val others: DataModel,
    @SerializedName("Dimapur") val dimapur: DataModel,
    @SerializedName("Kiphire") val kiphire: DataModel,
    @SerializedName("Kohima") val kohima: DataModel,
    @SerializedName("Longleng") val longleng: DataModel,
    @SerializedName("Mokokchung") val mokokchung: DataModel,
    @SerializedName("Mon") val mon: DataModel,
    @SerializedName("Peren") val peren: DataModel,
    @SerializedName("Phek") val phek: DataModel,
    @SerializedName("Tuensang") val tuensang: DataModel,
    @SerializedName("Wokha") val wokha: DataModel,
    @SerializedName("Zunheboto") val zunhebotowokha: DataModel,
)

data class MizoramData(
    val districtData: MizoramList,
    val statecode: String
)

data class MizoramList(
    @SerializedName("Aizawl") val aizawl: DataModel,
    @SerializedName("Champhai") val champhai: DataModel,
    @SerializedName("Hnahthial") val hnahthial: DataModel,
    @SerializedName("Khawzawl") val khawzawl: DataModel,
    @SerializedName("Kolasib") val kolasib: DataModel,
    @SerializedName("Lawngtlai") val lawngtlai: DataModel,
    @SerializedName("Lunglei") val lunglei: DataModel,
    @SerializedName("Mamit") val mamit: DataModel,
    @SerializedName("Saiha") val saiha: DataModel,
    @SerializedName("Saitual") val saitual: DataModel,
    @SerializedName("Serchhip") val serchhip: DataModel
)

data class MadhyaPradeshData(
    val districtData: MadhyaPradeshList,
    val statecode: String
)

data class MadhyaPradeshList(
    @SerializedName("Agar Malwa") val agarMalwa: DataModel,
    @SerializedName("Alirajpur") val alirajpur: DataModel,
    @SerializedName("Anuppur") val anuppur: DataModel,
    @SerializedName("Ashoknagar") val ashoknagar: DataModel,
    @SerializedName("Balaghat") val balaghat: DataModel,
    @SerializedName("Barwani") val barwani: DataModel,
    @SerializedName("Betul") val betul: DataModel,
    @SerializedName("Bhind") val bhind: DataModel,
    @SerializedName("Bhopal") val bhopal: DataModel,
    @SerializedName("Burhanpur") val burhanpur: DataModel,
    @SerializedName("Chhatarpur") val chhatarpur: DataModel,
    @SerializedName("Chhindwara") val chhindwara: DataModel,
    @SerializedName("Damoh") val damoh: DataModel,
    @SerializedName("Datia") val datia: DataModel,
    @SerializedName("Dewas") val dewas: DataModel,
    @SerializedName("Dhar") val dhar: DataModel,
    @SerializedName("Dindori") val dindori: DataModel,
    @SerializedName("Guna") val guna: DataModel,
    @SerializedName("Gwalior") val gwalior: DataModel,
    @SerializedName("Harda") val harda: DataModel,
    @SerializedName("Hoshangabad") val hoshangabad: DataModel,
    @SerializedName("Indore") val indore: DataModel,
    @SerializedName("Jabalpur") val jabalpur: DataModel,
    @SerializedName("Jhabua") val jhabua: DataModel,
    @SerializedName("Katni") val katni: DataModel,
    @SerializedName("Khandwa") val khandwa: DataModel,
    @SerializedName("Khargone") val khargone: DataModel,
    @SerializedName("Mandla") val mandla: DataModel,
    @SerializedName("Mandsaur") val mandsaur: DataModel,
    @SerializedName("Morena") val morena: DataModel,
    @SerializedName("Narsinghpur") val narsinghpur: DataModel,
    @SerializedName("Neemuch") val neemuch: DataModel,
    @SerializedName("Niwari") val niwari: DataModel,
    @SerializedName("Other Region") val otherRegion: DataModel,
    @SerializedName("Panna") val panna: DataModel,
    @SerializedName("Raisen") val raisen: DataModel,
    @SerializedName("Rajgarh") val rajgarh: DataModel,
    @SerializedName("Ratlam") val ratlam: DataModel,
    @SerializedName("Rewa") val rewa: DataModel,
    @SerializedName("Sagar") val sagar: DataModel,
    @SerializedName("Satna") val satna: DataModel,
    @SerializedName("Sehore") val seoni: DataModel,
    @SerializedName("Shahdol") val shahdol: DataModel,
    @SerializedName("Shajapur") val shajapur: DataModel,
    @SerializedName("Sheopur") val sheopur: DataModel,
    @SerializedName("Shivpuri") val shivpuri: DataModel,
    @SerializedName("Sidhi") val sidhi: DataModel,
    @SerializedName("Singrauli") val singrauli: DataModel,
    @SerializedName("Tikamgarh") val tikamgarh: DataModel,
    @SerializedName("Ujjain") val ujjain: DataModel,
    @SerializedName("Umaria") val umaria: DataModel,
    @SerializedName("Vidisha") val vidisha: DataModel,
    @SerializedName("Unknown") val unknown: DataModel
)

data class ManipurData(
    val districtData: ManipurList,
    val statecode: String
)

data class ManipurList(
    @SerializedName("CAPF Personnel") val personnel: DataModel,
    @SerializedName("Bishnupur") val bishnupur: DataModel,
    @SerializedName("Chandel") val chandel: DataModel,
    @SerializedName("Churachandpur") val churachandpurs: DataModel,
    @SerializedName("Imphal East") val imphalEast: DataModel,
    @SerializedName("Imphal West") val imphalWest: DataModel,
    @SerializedName("Jiribam") val jiribam: DataModel,
    @SerializedName("Kakching") val kakching: DataModel,
    @SerializedName("Kamjong") val kamjong: DataModel,
    @SerializedName("Kangpokpi") val kangpokpi: DataModel,
    @SerializedName("Noney") val noney: DataModel,
    @SerializedName("Pherzawl") val pherzawl: DataModel,
    @SerializedName("Senapati") val senapati: DataModel,
    @SerializedName("Tamenglong") val tamenglong: DataModel,
    @SerializedName("Tengnoupal") val tengnoupal: DataModel,
    @SerializedName("Thoubal") val thoubal: DataModel,
    @SerializedName("Ukhrul") val ukhrul: DataModel,
    @SerializedName("Unknown") val unknown: DataModel

    )

data class MeghalayaData(
    val districtData: MeghalayaList,
    val statecode: String
)

data class MeghalayaList(
    @SerializedName("East Garo Hills") val eastGaroHills: DataModel,
    @SerializedName("East Jaintia Hills") val eastJaintiaHills: DataModel,
    @SerializedName("East Khasi Hills") val eastKhasiHills: DataModel,
    @SerializedName("North Garo Hills") val northGaroHills: DataModel,
    @SerializedName("Ribhoi") val ribhoi: DataModel,
    @SerializedName("South Garo Hills") val southGaroHills: DataModel,
    @SerializedName("South West Garo Hills") val southWestGaroHills: DataModel,
    @SerializedName("South West Khasi Hills") val southWestKhasiHills: DataModel,
    @SerializedName("West Garo Hills") val westGaroHills: DataModel,
    @SerializedName("West Jaintia Hills") val westJaintiaHills: DataModel,
    @SerializedName("West Khasi Hills") val westKhasiHills: DataModel
)

data class MaharashtraData(
    val districtData: MaharashtraList,
    val statecode: String
)

data class MaharashtraList(
    @SerializedName("Ahmednagar") val ahmednagar: DataModel,
    @SerializedName("Akola") val akola: DataModel,
    @SerializedName("Amravati") val amravati: DataModel,
    @SerializedName("Aurangabad") val aurangabad: DataModel,
    @SerializedName("Beed") val beed: DataModel,
    @SerializedName("Bhandara") val bhandara: DataModel,
    @SerializedName("Buldhana") val buldhana: DataModel,
    @SerializedName("Chandrapur") val chandrapur: DataModel,
    @SerializedName("Dhule") val dhule: DataModel,
    @SerializedName("Gadchiroli") val gadchiroli: DataModel,
    @SerializedName("Gondia") val gondia: DataModel,
    @SerializedName("Hingoli") val hingoli: DataModel,
    @SerializedName("Jalgaon") val jalgaon: DataModel,
    @SerializedName("Jalna") val jalna: DataModel,
    @SerializedName("Kolhapur") val kolhapur: DataModel,
    @SerializedName("Latur") val latur: DataModel,
    @SerializedName("Mumbai") val mumbai: DataModel,
    @SerializedName("Mumbai Suburban") val mumbaiSuburban: DataModel,
    @SerializedName("Nagpur") val nagpur: DataModel,
    @SerializedName("Nanded") val nanded: DataModel,
    @SerializedName("Nandurbar") val nandurbar: DataModel,
    @SerializedName("Nashik") val nashik: DataModel,
    @SerializedName("Osmanabad") val osmanabad: DataModel,
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Palghar") val palghar: DataModel,
    @SerializedName("Parbhani") val parbhani: DataModel,
    @SerializedName("Pune") val pune: DataModel,
    @SerializedName("Raigad") val raigad: DataModel,
    @SerializedName("Ratnagiri") val ratnagiri: DataModel,
    @SerializedName("Sangli") val sangli: DataModel,
    @SerializedName("Satara") val satara: DataModel,
    @SerializedName("Sindhudurg") val sindhudurg: DataModel,
    @SerializedName("Solapur") val solapur: DataModel,
    @SerializedName("Thane") val thane: DataModel,
    @SerializedName("Wardha") val wardha: DataModel,
    @SerializedName("Washim") val Washim: DataModel,
    @SerializedName("Yavatmal") val yavatmal: DataModel
)

data class LakshadweepData(
    val districtData: LakshadweepList,
    val statecode: String
)

data class LakshadweepList(
    @SerializedName("Lakshadweep") val lakshadweep: DataModel,
    @SerializedName("Unknown") val unknown: DataModel
)

data class LadakhData(
    val districtData: LadakhList,
    val statecode: String
)

data class LadakhList(
    @SerializedName("Kargil") val kargil: DataModel,
    @SerializedName("Leh") val leh: DataModel
)

data class KeralaData(
    val districtData: KeralaList,
    val statecode: String
)

data class KeralaList(
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Alappuzha") val alappuzha: DataModel,
    @SerializedName("Ernakulam") val ernakulam: DataModel,
    @SerializedName("Idukki") val idukki: DataModel,
    @SerializedName("Kannur") val kannur: DataModel,
    @SerializedName("Kasaragod") val kasaragod: DataModel,
    @SerializedName("Kollam") val kollam: DataModel,
    @SerializedName("Kottayam") val kottayam: DataModel,
    @SerializedName("Kozhikode") val kozhikode: DataModel,
    @SerializedName("Malappuram") val malappuram: DataModel,
    @SerializedName("Palakkad") val palakkad: DataModel,
    @SerializedName("Pathanamthitta") val pathanamthitta: DataModel,
    @SerializedName("Thiruvananthapuram") val thiruvananthapuram: DataModel,
    @SerializedName("Thrissur") val thrissur: DataModel,
    @SerializedName("Wayanad") val wayanad: DataModel
)

data class KarnatakaData(
    val districtData: KarnatakaList,
    val statecode: String
)

data class KarnatakaList(
    @SerializedName("Bagalkote") val bagalkote: DataModel,
    @SerializedName("Ballari") val ballari: DataModel,
    @SerializedName("Belagavi") val belagavi: DataModel,
    @SerializedName("Bengaluru Rural") val bengaluruRural: DataModel,
    @SerializedName("Bengaluru Urban") val bengaluruUrban: DataModel,
    @SerializedName("Bidar") val bidar: DataModel,
    @SerializedName("Chamarajanagara") val chamarajanagara: DataModel,
    @SerializedName("Chikkaballapura") val chikkaballapura: DataModel,
    @SerializedName("Chikkamagaluru") val chikkamagaluru: DataModel,
    @SerializedName("Chitradurga") val chitradurga: DataModel,
    @SerializedName("Dakshina Kannada") val dakshinaKannada: DataModel,
    @SerializedName("Davanagere") val davanagere: DataModel,
    @SerializedName("Dharwad") val dharwad: DataModel,
    @SerializedName("Gadag") val gadag: DataModel,
    @SerializedName("Hassan") val hassan: DataModel,
    @SerializedName("Haveri") val haveri: DataModel,
    @SerializedName("Kalaburagi") val kalaburagi: DataModel,
    @SerializedName("Kodagu") val kodagu: DataModel,
    @SerializedName("Kolar") val kolar: DataModel,
    @SerializedName("Koppal") val koppal: DataModel,
    @SerializedName("Mandya") val mandya: DataModel,
    @SerializedName("Mysuru") val mysuru: DataModel,
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Raichur") val raichur: DataModel,
    @SerializedName("Ramanagara") val ramanagara: DataModel,
    @SerializedName("Shivamogga") val shivamogga: DataModel,
    @SerializedName("Tumakuru") val tumakuru: DataModel,
    @SerializedName("Udupi") val udupi: DataModel,
    @SerializedName("Uttara Kannada") val uttara: DataModel,
    @SerializedName("Vijayapura") val vijayapura: DataModel,
    @SerializedName("Yadgir") val yadgir: DataModel
)

data class JammuandKashmirData(
    val districtData: JammuandKashmirList,
    val statecode: String
)

data class JammuandKashmirList(
    @SerializedName("Anantnag") val anantnag: DataModel,
    @SerializedName("Bandipora") val bandipora: DataModel,
    @SerializedName("Baramulla") val baramulla: DataModel,
    @SerializedName("Budgam") val budgam: DataModel,
    @SerializedName("Doda") val doda: DataModel,
    @SerializedName("Ganderbal") val ganderbal: DataModel,
    @SerializedName("Jammu") val jammu: DataModel,
    @SerializedName("Kathua") val kathua: DataModel,
    @SerializedName("Kishtwar") val kishtwar: DataModel,
    @SerializedName("Kulgam") val kulgam: DataModel,
    @SerializedName("Kupwara") val kupwara: DataModel,
    @SerializedName("Mirpur") val mirpur: DataModel,
    @SerializedName("Muzaffarabad") val muzaffarabad: DataModel,
    @SerializedName("Pulwama") val pulwama: DataModel,
    @SerializedName("Punch") val punch: DataModel,
    @SerializedName("Rajouri") val rajouri: DataModel,
    @SerializedName("Ramban") val ramban: DataModel,
    @SerializedName("Reasi") val reasi: DataModel,
    @SerializedName("Samba") val samba: DataModel,
    @SerializedName("Shopiyan") val shopiyan: DataModel,
    @SerializedName("Srinagar") val srinagar: DataModel,
    @SerializedName("Udhampur") val udhampur: DataModel
)

data class JharkhandData(
    @SerializedName("Bokaro") val bokaro: DataModel,
    @SerializedName("Chatra") val chatra: DataModel,
    @SerializedName("Deoghar") val deoghar: DataModel,
    @SerializedName("Dhanbad") val dhanbad: DataModel,
    @SerializedName("Dumka") val dumka: DataModel,
    @SerializedName("East Singhbhum") val eastSinghbhum: DataModel,
    @SerializedName("Garhwa") val garhwa: DataModel,
    @SerializedName("Giridih") val giridih: DataModel,
    @SerializedName("Godda") val godda: DataModel,
    @SerializedName("Gumla") val gumla: DataModel,
    @SerializedName("Hazaribagh") val hazaribagh: DataModel,
    @SerializedName("Jamtara") val kaithal: DataModel,
    @SerializedName("Khunti") val khunti: DataModel,
    @SerializedName("Koderma") val koderma: DataModel,
    @SerializedName("Latehar") val latehar: DataModel,
    @SerializedName("Lohardaga") val lohardaga: DataModel,
    @SerializedName("Pakur") val pakur: DataModel,
    @SerializedName("Palamu") val palamu: DataModel,
    @SerializedName("Ramgarh") val ramgarh: DataModel,
    @SerializedName("Ranchi") val ranchi: DataModel,
    @SerializedName("Sahibganj") val sahibganj: DataModel,
    @SerializedName("Saraikela-Kharsawan") val saraikela: DataModel,
    @SerializedName("Simdega") val simdega: DataModel,
    @SerializedName("West Singhbhum") val westinghbhum: DataModel


    )

data class HaryanaData(
    val districtData: HaryanaList,
    val statecode: String
)

data class HaryanaList(
    @SerializedName("Foreign Evacuees") val foreignEvacuees: DataModel,
    @SerializedName("Ambala") val ambala: DataModel,
    @SerializedName("Bhiwani") val bhiwani: DataModel,
    @SerializedName("Charkhi Dadri") val charkhiDadri: DataModel,
    @SerializedName("Faridabad") val faridabad: DataModel,
    @SerializedName("Fatehabad") val fatehabad: DataModel,
    @SerializedName("Gurugram") val gurugram: DataModel,
    @SerializedName("Hisar") val hisar: DataModel,
    @SerializedName("Italians") val italians: DataModel,
    @SerializedName("Jhajjar") val jhajjar: DataModel,
    @SerializedName("Jind") val jind: DataModel,
    @SerializedName("Kaithal") val kaithal: DataModel,
    @SerializedName("Karnal") val karnal: DataModel,
    @SerializedName("Kurukshetra") val kurukshetra: DataModel,
    @SerializedName("Mahendragarh") val mahendragarh: DataModel,
    @SerializedName("Nuh") val nuh: DataModel,
    @SerializedName("Palwal") val palwal: DataModel,
    @SerializedName("Panchkula") val panchkula: DataModel,
    @SerializedName("Panipat") val panipat: DataModel,
    @SerializedName("Rewari") val rewari: DataModel,
    @SerializedName("Rohtak") val rohtak: DataModel,
    @SerializedName("Sirsa") val sirsa: DataModel,
    @SerializedName("Sonipat") val sonipat: DataModel,
    @SerializedName("Yamunanagar") val yamunanagar: DataModel
)

data class HimachalPradeshData(
    val districtData: HimachalPradeshList,
    val statecode: String
)

data class HimachalPradeshList(
    @SerializedName("Bilaspur") val bilaspur: DataModel,
    @SerializedName("Chamba") val chamba: DataModel,
    @SerializedName("Hamirpur") val hamirpur: DataModel,
    @SerializedName("Kangra") val kangra: DataModel,
    @SerializedName("Kinnaur") val kinnaur: DataModel,
    @SerializedName("Kullu") val kullu: DataModel,
    @SerializedName("Lahaul and Spiti") val LahaulandSpiti: DataModel,
    @SerializedName("Mandi") val mandi: DataModel,
    @SerializedName("Shimla") val shimla: DataModel,
    @SerializedName("Sirmaur") val sirmaur: DataModel,
    @SerializedName("Solan") val solan: DataModel,
    @SerializedName("Una") val una: DataModel
)

data class GujaratData(
    val districtData: GujaratList,
    val statecode: String
)

data class GujaratList(
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Ahmedabad") val ahmedabad: DataModel,
    @SerializedName("Amreli") val amreli: DataModel,
    @SerializedName("Anand") val anand: DataModel,
    @SerializedName("Aravalli") val aravalli: DataModel,
    @SerializedName("Banaskantha") val banaskantha: DataModel,
    @SerializedName("Bharuch") val bharuch: DataModel,
    @SerializedName("Bhavnagar") val bhavnagar: DataModel,
    @SerializedName("Botad") val botad: DataModel,
    @SerializedName("Chhota Udaipur") val chhotaUdaipur: DataModel,
    @SerializedName("Dahod") val dahod: DataModel,
    @SerializedName("Dang") val dang: DataModel,
    @SerializedName("Devbhumi Dwarka") val devbhumiDwarka: DataModel,
    @SerializedName("Gandhinagar") val gandhinagar: DataModel,
    @SerializedName("Gir Somnath") val girSomnath: DataModel,
    @SerializedName("Jamnagar") val jamnagar: DataModel,
    @SerializedName("Junagadh") val junagadh: DataModel,
    @SerializedName("Kheda") val kheda: DataModel,
    @SerializedName("Kutch") val kutch: DataModel,
    @SerializedName("Mahisagar") val mahisagar: DataModel,
    @SerializedName("Mehsana") val mehsana: DataModel,
    @SerializedName("Morbi") val morbi: DataModel,
    @SerializedName("Narmada") val narmada: DataModel,
    @SerializedName("Navsari") val navsari: DataModel,
    @SerializedName("Panchmahal") val panchmahal: DataModel,
    @SerializedName("Patan") val patan: DataModel,
    @SerializedName("Porbandar") val porbandar: DataModel,
    @SerializedName("Rajkot") val rajkot: DataModel,
    @SerializedName("Sabarkantha") val sabarkantha: DataModel,
    @SerializedName("Surat") val surat: DataModel,
    @SerializedName("Surendranagar") val surendranagar: DataModel,
    @SerializedName("Tapi") val tapi: DataModel,
    @SerializedName("Vadodara") val vadodara: DataModel,
    @SerializedName("Valsad") val valsad: DataModel
)

data class GoaData(
    val districtData: GoaList,
    val statecode: String
)

data class GoaList(
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("North Goa") val northGoa: DataModel,
    @SerializedName("South Goa") val southGoa: DataModel,
    @SerializedName("Unknown") val unknown: DataModel,
)

data class DadraandNagarData(
    val districtData: DadraandNagarList,
    val statecode: String,
)

data class DadraandNagarList(
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Dadra and Nagar Haveli") val dadraandNagarHaveli: DataModel,
    @SerializedName("Daman") val daman: DataModel,
    @SerializedName("Diu") val diu: DataModel,
)

data class DehliData(
    val districtData: DehliList,
    val statecode: String,
)

data class DehliList(
    @SerializedName("Central Delhi") val centralDelhi: DataModel,
    @SerializedName("East Delhi") val eastDelhi: DataModel,
    @SerializedName("New Delhi") val newDelhi: DataModel,
    @SerializedName("North Delhi") val northDelhi: DataModel,
    @SerializedName("North East Delhi") val northEastDelhi: DataModel,
    @SerializedName("North West Delhi") val northWestDelhi: DataModel,
    @SerializedName("Shahdara") val shahdara: DataModel,
    @SerializedName("South Delhi") val southDelhi: DataModel,
    @SerializedName("South East Delhi") val southEastDelhi: DataModel,
    @SerializedName("South West Delhi") val southWestDelhi: DataModel,
    @SerializedName("West Delhi") val westDelhi: DataModel,
    @SerializedName("Unknown") val unknown: DataModel,
)

data class ChhattisgarhData(
    val districtData: ChhattisgarhList,
    val statecode: String,
)

data class ChhattisgarhList(
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Balod") val balod: DataModel,
    @SerializedName("Baloda Bazar") val balodaBazar: DataModel,
    @SerializedName("Balrampur") val balrampur: DataModel,
    @SerializedName("Bametara") val bametara: DataModel,
    @SerializedName("Bastar") val bastar: DataModel,
    @SerializedName("Bijapur") val bijapur: DataModel,
    @SerializedName("Bilaspur") val bilaspur: DataModel,
    @SerializedName("Dakshin Bastar Dantewada") val dakshinBastarDantewada: DataModel,
    @SerializedName("Dhamtari") val dhamtari: DataModel,
    @SerializedName("Durg") val durg: DataModel,
    @SerializedName("Gariaband") val gariaband: DataModel,
    @SerializedName("Janjgir Champa") val janjgirChampa: DataModel,
    @SerializedName("Jashpur") val jashpur: DataModel,
    @SerializedName("Kabeerdham") val kabeerdham: DataModel,
    @SerializedName("Kondagaon") val kondagaoni: DataModel,
    @SerializedName("Korba") val korba: DataModel,
    @SerializedName("Koriya") val koriya: DataModel,
    @SerializedName("Mahasamund") val mahasamund: DataModel,
    @SerializedName("Mungeli") val mungeli: DataModel,
    @SerializedName("Narayanpur") val narayanpur: DataModel,
    @SerializedName("Raigarh") val raigarh: DataModel,
    @SerializedName("Raipur") val raipur: DataModel,
    @SerializedName("Rajnandgaon") val rajnandgaon: DataModel,
    @SerializedName("Sukma") val sukma: DataModel,
    @SerializedName("Surajpur") val surajpur: DataModel,
    @SerializedName("Surguja") val surguja: DataModel,
    @SerializedName("Uttar Bastar Kanker") val uttarBastarKanker: DataModel,
    @SerializedName("Gaurela Pendra Marwahi") val gaurelaPendraMarwahi: DataModel,
)

data class AssamData(
    val districtData: AssamList,
    val statecode: String,
)

data class AssamList(
    @SerializedName("Airport Quarantine") val airportQuarantine: DataModel,
    @SerializedName("Baksa") val baksa: DataModel,
    @SerializedName("Barpeta") val barpeta: DataModel,
    @SerializedName("Biswanath") val biswanath: DataModel,
    @SerializedName("Bongaigaon") val bongaigaon: DataModel,
    @SerializedName("Cachar") val cachar: DataModel,
    @SerializedName("Charaideo") val charaideo: DataModel,
    @SerializedName("Chirang") val chirang: DataModel,
    @SerializedName("Darrang") val darrang: DataModel,
    @SerializedName("Dhemaji") val dhemaji: DataModel,
    @SerializedName("Dhubri") val dhubri: DataModel,
    @SerializedName("Dibrugarh") val dibrugarh: DataModel,
    @SerializedName("Dima Hasao") val dimaHasao: DataModel,
    @SerializedName("Goalpara") val goalpara: DataModel,
    @SerializedName("Golaghat") val golaghat: DataModel,
    @SerializedName("Hailakandi") val hailakandi: DataModel,
    @SerializedName("Hojai") val hojai: DataModel,
    @SerializedName("Jorhat") val jorhat: DataModel,
    @SerializedName("Kamrup") val kamrup: DataModel,
    @SerializedName("Kamrup Metropolitan") val kamrupMetropolitan: DataModel,
    @SerializedName("Karbi Anglong") val karbiAnglong: DataModel,
    @SerializedName("Karimganj") val karimganj: DataModel,
    @SerializedName("Morigaon") val morigaon: DataModel,
    @SerializedName("Nagaon") val nagaon: DataModel,
    @SerializedName("Nalbari") val nalbari: DataModel,
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Sivasagar") val sivasagar: DataModel,
    @SerializedName("Sonitpur") val sonitpur: DataModel,
    @SerializedName("South Salmara Mankachar") val southSalmaraMankachar: DataModel,
    @SerializedName("Tinsukia") val tinsukia: DataModel,
    @SerializedName("West Karbi Anglong") val westKarbiAnglong: DataModel,
    @SerializedName("Unknown") val unknown: DataModel,
)

data class ArunachalPradeshData(
    val districtData: ArunachalPradeshList,
    val statecode: String,
)

data class ArunachalPradeshList(
    @SerializedName("Anjaw") val anjaw: DataModel,
    @SerializedName("Changlang") val changlang: DataModel,
    @SerializedName("East Kameng") val eastKameng: DataModel,
    @SerializedName("East Siang") val eastSiang: DataModel,
    @SerializedName("Kamle") val kamle: DataModel,
    @SerializedName("Kra Daadi") val kraDaadi: DataModel,
    @SerializedName("Kurung Kumey") val kurungKumey: DataModel,
    @SerializedName("Lepa Rada") val lepaRada: DataModel,
    @SerializedName("Lohit") val lohit: DataModel,
    @SerializedName("Longding") val longding: DataModel,
    @SerializedName("Lower Dibang Valley") val lowerDibangValley: DataModel,
    @SerializedName("Lower Siang") val lowerSiang: DataModel,
    @SerializedName("Lower Subansiri") val lowerSubansiri: DataModel,
    @SerializedName("Namsai") val namsai: DataModel,
    @SerializedName("Pakke Kessang") val pakkeKessang: DataModel,
    @SerializedName("Papum Pare") val papumPare: DataModel,
    @SerializedName("Shi Yomi") val shiYomi: DataModel,
    @SerializedName("Siang") val siang: DataModel,
    @SerializedName("Tawang") val tawang: DataModel,
    @SerializedName("Tirap") val tirap: DataModel,
    @SerializedName("Upper Dibang Valley") val upperDibangValley: DataModel,
    @SerializedName("Upper Siang") val upperSiang: DataModel,
    @SerializedName("Upper Subansiri") val upperSubansiri: DataModel,
    @SerializedName("West Kameng") val westKameng: DataModel,
    @SerializedName("West Siang") val westSiang: DataModel,

    )

data class BirahData(
    val districtData: BirahList,
    val statecode: String,
)

data class BirahList(
    @SerializedName("Araria") val araria: DataModel,
    @SerializedName("Arwal") val arwal: DataModel,
    @SerializedName("Banka") val banka: DataModel,
    @SerializedName("Aurangabad") val aurangabad: DataModel,
    @SerializedName("Begusarai") val begusarai: DataModel,
    @SerializedName("Bhagalpur") val bhagalpur: DataModel,
)

data class ChanData(
    val districtData: chanList,
    val statecode: String,
)

data class chanList(
    @SerializedName("Chandigarh") val Chandigarh: DataModel,
)


data class StateData(
    val districtData: Unassigned,
    val statecode: String,
)

data class Unassigned(
    @SerializedName("Unassigned") val unAssigned: DataModel,
)

data class AndamanandNicobarData(
    val districtData: AndamanandNicobarList,
    val statecode: String,
)

data class AndamanandNicobarList(
    val Nicobars: DataModel,
    @SerializedName("North and Middle Andaman") val NorthandMiddleAndaman: DataModel,
    @SerializedName("South Andaman ") val SouthAndaman: DataModel,
    val Unknown: DataModel,
)

data class AndhraPradeshData(
    val districtData: AndhraPradeshList,
    val statecode: String,
)

data class AndhraPradeshList(
    @SerializedName("Foreign Evacuees") val foreignEvacuees: DataModel,
    @SerializedName("Anantapur") val anantapur: DataModel,
    @SerializedName("Chittoor") val chittoor: DataModel,
    @SerializedName("East Godavari") val eastGodavarival: DataModel,
    @SerializedName("Guntur") val guntur: DataModel,
    @SerializedName("Krishna") val krishna: DataModel,
    @SerializedName("Kurnool") val kurnool: DataModel,
    @SerializedName("Other State") val otherState: DataModel,
    @SerializedName("Prakasam") val prakasam: DataModel,
    @SerializedName("S.P.S. Nellore") val nellore: DataModel,
    @SerializedName("Srikakulam") val srikakulam: DataModel,
    @SerializedName("Visakhapatnam") val visakhapatnam: DataModel,
    @SerializedName("Vizianagaram") val vzianagaram: DataModel,
    @SerializedName("West Godavari") val westGodavari: DataModel,
    @SerializedName("Y.S.R. Kadapa") val kadapa: DataModel,
)


data class DataModel(
    val notes: String,
    val active: Int,
    val confirmed: Int,
    val migratedother: Int,
    val deceased: Int,
    val recovered: Int,
    val delta: Deltaclass,
)

data class Deltaclass(
    val confirmed: Int,
    val deceased: Int,
    val recovered: Int,
)


