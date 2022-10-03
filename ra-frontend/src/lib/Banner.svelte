<script lang="ts">
    import banner from '$lib/assets/banner.jpg';
</script>

<figure class="bleed {$$props.class}">
    <img src="{banner}" alt="banner">
</figure>

<style lang="scss">
  img {
    width: 100%;
  }

  figure {
    padding: 0;
    max-height: 50vh;
    overflow: hidden;
  }
</style>