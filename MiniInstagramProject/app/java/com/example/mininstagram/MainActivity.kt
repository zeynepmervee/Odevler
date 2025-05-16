class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewPosts)
        val posts = listOf(
            Post("mehmet_feyyaz", "", "", "Harika bir gün!"),
            Post("ceylan_vet", "", "", "Doğada yürüyüş 💚")
        )

        adapter = PostAdapter(posts)
        recyclerView.adapter = adapter
    }
}
